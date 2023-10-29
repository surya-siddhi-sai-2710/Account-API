package com.dh.accounts.model;

public class AccountDetails {

	private AccountDetailsRequest accountRequest;
	
	private AccountDetailsResponse accountResponse;

	//getters and setters
	public AccountDetailsRequest getAccountRequest() {
		return accountRequest;
	}

	public void setAccountRequest(AccountDetailsRequest accountRequest) {
		this.accountRequest = accountRequest;
	}

	public AccountDetailsResponse getAccountResponse() {
		return accountResponse;
	}

	public void setAccountResponse(AccountDetailsResponse accountResponse) {
		this.accountResponse = accountResponse;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountRequest=" + accountRequest + ", accountResponse=" + accountResponse + "]";
	}
	
}
