package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AccountRequest")
public class AccountRequestBackend {

	@XmlElement(name = "Account")
	protected AccountDetailsBackendRequest accountDetailsRequest;

	public AccountDetailsBackendRequest getAccountDetailsRequest() {
		return accountDetailsRequest;
	}

	public void setAccountDetailsRequest(AccountDetailsBackendRequest accountDetailsBackendRequest) {
		this.accountDetailsRequest = accountDetailsBackendRequest;
	}

	@Override
	public String toString() {
		return "AccountRequestBackend [accountDetailsRequest=" + accountDetailsRequest + "]";
	}

//	private AccountDetailsBackendResponse accountDetailsResponse;
//
//	public AccountDetailsBackendResponse getAccountDetailsResponse() {
//		return accountDetailsResponse;
//	}
//
//	public void setAccountDetailsResponse(AccountDetailsBackendResponse accountDetailsResponse) {
//		this.accountDetailsResponse = accountDetailsResponse;
//	}

}
