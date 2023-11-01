package com.dh.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountRequest {

	@JsonProperty("accountRequest")
	protected AccountDetailsRequest accountDetailsRequest;

	public AccountDetailsRequest getAccountDetailsRequest() {
		return accountDetailsRequest;
	}

	public void setAccountDetailsRequest(AccountDetailsRequest accountDetailsRequest) {
		this.accountDetailsRequest = accountDetailsRequest;
	}

}
