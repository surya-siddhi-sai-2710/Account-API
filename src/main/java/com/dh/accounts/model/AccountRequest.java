package com.dh.accounts.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountRequest {

	@Autowired
	@JsonProperty("AccountRequest")
	protected AccountDetailsRequest accountDetailsRequest;

	public AccountDetailsRequest getAccountDetailsRequest() {
		return accountDetailsRequest;
	}

	public void setAccountDetailsRequest(AccountDetailsRequest accountDetailsRequest) {
		this.accountDetailsRequest = accountDetailsRequest;
	}
	
}
