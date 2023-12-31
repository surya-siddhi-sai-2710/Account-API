package com.dh.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetailsRequest {

	@JsonProperty("accno")
	private int accno;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public AccountDetailsRequest() {
		super();
	}

	public AccountDetailsRequest(int accno) {
		super();
		this.accno = accno;
	}

	@Override
	public String toString() {
		return "AccountDetailsRequest [accno=" + accno + "]";
	}
}
