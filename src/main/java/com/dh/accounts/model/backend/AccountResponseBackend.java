package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "AccountResponse")
public class AccountResponseBackend {
	
	@Autowired
	@XmlElement(name = "account")
	protected AccountDetailsBackendResponse accountDetailsBackendResponse;
	
	@Autowired
	@XmlElement(name = "loan")
	protected LoanDetailsBackend loanDetailsBackend;
	
	@Autowired
	@XmlElement(name = "name")
	protected NameDetailsBackend nameDetailsBackend;
	
	@Autowired
	@XmlElement(name = "bankInfo")
	protected BankInfoBackend bankInfoBackend;
	

	//getters and setters
	public AccountDetailsBackendResponse getAccountDetailsBackendResponse() {
		return accountDetailsBackendResponse;
	}

	public void setAccountDetailsBackendResponse(AccountDetailsBackendResponse accountDetailsBackendResponse) {
		this.accountDetailsBackendResponse = accountDetailsBackendResponse;
	}

	public LoanDetailsBackend getLoanDetailsBackend() {
		return loanDetailsBackend;
	}

	public void setLoanDetailsBackend(LoanDetailsBackend loanDetailsBackend) {
		this.loanDetailsBackend = loanDetailsBackend;
	}

	public NameDetailsBackend getNameDetailsBackend() {
		return nameDetailsBackend;
	}

	public void setNameDetailsBackend(NameDetailsBackend nameDetailsBackend) {
		this.nameDetailsBackend = nameDetailsBackend;
	}
	

	public BankInfoBackend getBankInfoBackend() {
		return bankInfoBackend;
	}

	public void setBankInfoBackend(BankInfoBackend bankInfoBackend) {
		this.bankInfoBackend = bankInfoBackend;
	}

	//toString method
	@Override
	public String toString() {
		return "AccountResponseBackend [accountDetailsBackendResponse=" + accountDetailsBackendResponse
				+ ", loanDetailsBackend=" + loanDetailsBackend + ", nameDetailsBackend=" + nameDetailsBackend + "]";
	}
	
}
