package com.dh.accounts;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWith;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.apache.camel.test.spring.junit5.UseAdviceWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.web.WebAppConfiguration;
 
 
import com.dh.accounts.model.AccountRequest;
import com.dh.accounts.model.AccountResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import com.google.common.base.Charsets;

//@MockEndpointsAndSkip("{{MOCK_URL.host}}/api/accounts/view?bridgeEndpoint=true")

@UseAdviceWith
@CamelSpringBootTest
@SpringBootApplication
@WebAppConfiguration
@PropertySource("classpath:application-test.properties")
@ComponentScan("com.dh.accounts.*")

public class AccountsRouteBuilderTest{
	
	@Autowired
	ProducerTemplate producerTemplate1;
	
	@Autowired
	CamelContext camelContext;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	ApplicationContext applicationContext;
	
	@EndpointInject("mock://{{MOCK_URL.host}}/api/accounts/view?bridgeEndpoint=true")
	private MockEndpoint cdmockEndpoint;
	
	@Test
	public void testMethod() throws Exception{
		
		String accountRequest = Resources.toString
				(Resources.getResource("mock/Request/Account/AccountRequest.json")
						, Charsets.UTF_8);
		
		String accountResponse = Resources.toString(
				Resources.getResource("mock/Response/Account/AccountResponse.json"),
				Charsets.UTF_8);
		
		AdviceWith.adviceWith(camelContext, "accountRequest", routeBuilder -> {
			routeBuilder.replaceFromWith("direct: invoke-account-details");
		});
		
		camelContext.start();
		
		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {

			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(accountResponse);
			}
		});
		
		AccountRequest oAccountRequest = objectMapper.readValue(accountRequest, AccountRequest.class);
		AccountResponse ccAccountResponse = producerTemplate1.requestBody("direct: invoke-account-details", oAccountRequest, AccountResponse.class);
		System.out.println("ccAccountResponse"+ccAccountResponse.getAccountDetailsResponse().toString());
		Assertions.assertTrue(null!= ccAccountResponse.getAccountDetailsResponse().getName());
	}
	

//	@Override
//	 public boolean isUseAdviceWith() {
//	 return true;
//	 }
	
//	@Before
//	 public void before() throws Exception {
//	 AdviceWithRouteBuilder mockRoute = new AdviceWithRouteBuilder() {
//	 @Override
//	 public void configure() throws Exception {
//	 replaceFromWith("direct:start");
//	 }};
//	 RouteDefinition rd = camelContext.getRouteDefinition("AccountRequest");
//	 rd.adviceWith(camelContext, mockRoute);
//	 camelContext.start();
//	}
//	
//	@Override
//	 public String isMockEndpointsAndSkip() {
//	 return "http://localhost:8080/api/accounts/view";
//	 }
//	
//	@Test
//	 public void testRoute() throws Exception {
//	 String request = Resources.toString(Resources.getResource("AccountRequest.json"),
//	Charsets.UTF_8);
//	 String mockApiResponse =
//	Resources.toString(Resources.getResource("AccountResponse.json"),
//	Charsets.UTF_8);
//	 System.out.println("Hi");
//	 // Expect: The endpoint to get 1 message
//	 cdmockEndpoint.expectedMessageCount(1);
//	 cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
//	 public void process(Exchange exchange) throws Exception {
//	 System.out.println("Here");
//	 exchange.getIn().setBody(mockApiResponse);
//	 }
//	 });
//	 String out =template.requestBody("direct:start",request,String.class);
//	 System.out.println(out);
//	 }
//	
//	@Override
//	protected RoutesBuilder[] createRouteBuilders() throws Exception {
//	 return new RouteBuilder[] { new RestRouteBuilder() };
//	}
//	
	
}
