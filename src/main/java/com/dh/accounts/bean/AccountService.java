package com.dh.accounts.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Service;

import com.dh.accounts.model.AccountDetailsRequest;
import com.dh.accounts.model.AccountDetailsResponse;
import com.dh.accounts.model.AccountRequest;
import com.dh.accounts.model.AccountResponse;
import com.dh.accounts.model.BankInfo;
import com.dh.accounts.model.BankMembers;
import com.dh.accounts.model.LoanType;
import com.dh.accounts.model.NameType;
import com.dh.accounts.model.backend.AccountDetailsBackendRequest;
import com.dh.accounts.model.backend.AccountDetailsBackendResponse;
import com.dh.accounts.model.backend.AccountRequestBackend;
import com.dh.accounts.model.backend.AccountResponseBackend;
import com.dh.accounts.model.backend.BankInfoBackend;
import com.dh.accounts.model.backend.BankMembersBackend;
import com.dh.accounts.model.backend.LoanDetailsBackend;
import com.dh.accounts.model.backend.NameDetailsBackend;

@Service("AccountService")
public class AccountService {
	
	public AccountRequestBackend getAccountRequestBackend(Exchange exchange) throws Exception{
		
		AccountRequest oAccountRequest = exchange.getIn().getBody(AccountRequest.class);	//getting the account request through exchange
		AccountDetailsRequest oAccountDetailsRequest = new AccountDetailsRequest();			
		oAccountDetailsRequest = oAccountRequest.getAccountDetailsRequest();			//getting the accno from request class
		AccountRequestBackend oAccountRequestBackend = new AccountRequestBackend(); 	//object of backend request class
		AccountDetailsBackendRequest oAccountDetailsBackendRequest = new AccountDetailsBackendRequest();
		oAccountDetailsBackendRequest.setAccno(oAccountDetailsRequest.getAccno());			// setting the request accno and passing to backend
		
		oAccountRequestBackend.setAccountDetailsRequest(oAccountDetailsBackendRequest);
		
		return oAccountRequestBackend;				//returning the request object
		
	}
	
	public void getAccountDetailsBackendResponse(Exchange exchange) throws Exception{
		
		Message oMessage = exchange.getIn();
		AccountResponseBackend oAccountResponseBackend = exchange.getIn().getBody(AccountResponseBackend.class);		
		AccountDetailsBackendResponse oAccountDetailsBackendResponse = new AccountDetailsBackendResponse();
		oAccountDetailsBackendResponse = oAccountResponseBackend.getAccountDetailsBackendResponse();			// getting the response to requested request
		AccountDetailsResponse oAccountDetailsResponse = new AccountDetailsResponse(); 
		AccountResponse oAccountResponse = new AccountResponse();
		
		
		// setting backend for loan
		LoanDetailsBackend oLoanDetailsBackend = new LoanDetailsBackend(); 
		oLoanDetailsBackend = oAccountDetailsBackendResponse.getLoan();
		LoanType loanType = new LoanType();
		
		
		// mapping loan
		loanType.setP_amount(oLoanDetailsBackend.getP_amount());
		loanType.setRate(oLoanDetailsBackend.getRate());
		loanType.setIntrest(oLoanDetailsBackend.getIntrest());
		
		// setting backend for name
		NameDetailsBackend oNameDetailsBackend = new NameDetailsBackend();
		oNameDetailsBackend = oAccountDetailsBackendResponse.getName();
		NameType nameType = new NameType();
		
		
		// mapping name
		nameType.setFirstname(oNameDetailsBackend.getFirstname());
		nameType.setLastname(oNameDetailsBackend.getLastname());
		nameType.setSurname(oNameDetailsBackend.getSurname());
		
		
		// mapping all parameters
		// setting the values to appropriate parameters 
		oAccountDetailsResponse.setAccno(oAccountDetailsBackendResponse.getAccno());			
		oAccountDetailsResponse.setName(nameType);
		oAccountDetailsResponse.setPhoneno(oAccountDetailsBackendResponse.getPhoneno());
		oAccountDetailsResponse.setGender(oAccountDetailsBackendResponse.getGender());
		oAccountDetailsResponse.setAmount(oAccountDetailsBackendResponse.getAmount());
		oAccountDetailsResponse.setLoan(loanType);
		oAccountDetailsResponse.setBranch(oAccountDetailsBackendResponse.getBranch());
		oAccountDetailsResponse.setZipcode(oAccountDetailsBackendResponse.getZipcode());
		
		
		//setting the ACCOUNT response
		oAccountResponse.setAccountDetailsResponse(oAccountDetailsResponse);
		
		
		// setting additional bank information
		BankInfoBackend oBankInfoBackend = new BankInfoBackend();
		oBankInfoBackend = oAccountResponseBackend.getBankInfoBackend();
		
		//setting employees list backend
		List<BankMembersBackend> bankMembersBackends = new ArrayList<>();
		bankMembersBackends = oBankInfoBackend.getBankMembersBackend();
		
		//initilizing frontend bank members list
		List<BankMembers> bankMembers = new ArrayList<>();
		
		//mapping the list using for loop
		for(BankMembersBackend bankMembersBackend : bankMembersBackends) {		 //Syntax for(type variableName : arrayname) {}  used to iterate through list or array
			
			//initilizing the frontend bankMembers object
			BankMembers oBankMembers = new BankMembers();
			
			oBankMembers.setEmp1(bankMembersBackend.getEmp1());
			oBankMembers.setEmp2(bankMembersBackend.getEmp2());
			oBankMembers.setEmp3(bankMembersBackend.getEmp3());
			
			//add the elements into the list
			bankMembers.add(oBankMembers);
		}
		
		// setting the front end bankInfo response
		BankInfo bankInfo = new BankInfo();
		bankInfo.setBankName(oBankInfoBackend.getBankName());
		bankInfo.setBankRating(oBankInfoBackend.getBankRating());
		bankInfo.setBankCurrency(oBankInfoBackend.getBankCurrency());
		
		bankInfo.setBankMembers(bankMembers);
		
		//setting the BANKINFO response
		oAccountResponse.setBankInfo(bankInfo);
		
		//setting ACCOUNT RESPONSE
		oMessage.setBody(oAccountResponse);			// returning the response object to postman response body 
//		return oAccountResponse;
	}
}
