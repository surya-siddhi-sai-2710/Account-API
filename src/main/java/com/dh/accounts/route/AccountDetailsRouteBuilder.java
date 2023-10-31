package com.dh.accounts.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.dh.accounts.model.AccountRequest;
import com.dh.accounts.model.AccountResponse;
import com.dh.accounts.model.backend.AccountRequestBackend;
import com.dh.accounts.model.backend.AccountResponseBackend;

@Component
public class AccountDetailsRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration()
			.bindingMode(RestBindingMode.auto);

		rest("/api")
			.post("/accounts/view")
//			.type(AccountDetails.class)
//			.outType(AccountDetails.class)
			.type(AccountRequest.class)
			.outType(AccountResponse.class)
			.consumes("application/json")
			.produces("application/json")
			.to("direct:invoke-account-details");

		
		from("direct:invoke-account-details")
			.routeId("accountRequest")
			.to("bean:AccountService?method=getAccountRequestBackend")
			.marshal().jacksonXml(AccountRequestBackend.class)
//			.log("test log 1")
//			.log("${body}")
			.to("direct:invoke-send-to-backend");
		
		
		from("direct:invoke-send-to-backend")
			.setHeader(Exchange.CONTENT_TYPE, constant("application/xml"))
			.log("${body}")
//			.to(ev.getProperty("URL"))
			.to("{{MOCK_URL.host}}"+"/api/accounts/view?bridgeEndpoint=true")
//			.log("test log 2")
//			.log("${body}")

			.unmarshal().jacksonXml(AccountResponseBackend.class)
//			.log("${body}")
//			.log("test log 3")
			.to("bean:AccountService?method=getAccountDetailsBackendResponse")
//			.log("${body} -test log end")
			.setHeader("Content-Type", constant("application/json"));

	}
}
