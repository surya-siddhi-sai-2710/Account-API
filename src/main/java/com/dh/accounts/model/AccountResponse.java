package com.dh.accounts.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountResponse {

	@JsonProperty("accountResponse")
	protected AccountDetailsResponse accountDetailsResponse;

	@JsonProperty("nameType")
	protected NameType nameType;

	@JsonProperty("loanType")
	protected LoanType loanType;

	@JsonProperty("bankInfo")
	protected BankInfo bankInfo;

	@JsonProperty("bankMembers")
	protected List<BankMembers> bankMembers;

	// getters and setters
	public AccountDetailsResponse getAccountDetailsResponse() {
		return accountDetailsResponse;
	}

	public void setAccountDetailsResponse(AccountDetailsResponse accountDetailsResponse) {
		this.accountDetailsResponse = accountDetailsResponse;
	}

	public NameType getNameType() {
		return nameType;
	}

	public void setNameType(NameType nameType) {
		this.nameType = nameType;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}

	public List<BankMembers> getBankMembers() {
		return bankMembers;
	}

	public void setBankMembers(List<BankMembers> bankMembers) {
		this.bankMembers = bankMembers;
	}

	// toString method
	@Override
	public String toString() {
		return "AccountResponse [accountDetailsResponse=" + accountDetailsResponse + ", nameType=" + nameType
				+ ", loanType=" + loanType + "]";
	}

}
