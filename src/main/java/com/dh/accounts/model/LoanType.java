package com.dh.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanType {

	@JsonProperty("p_amount")
	private int p_amount;

	@JsonProperty("rate")
	private int rate;

	@JsonProperty("intrest")
	private int intrest;

	// default constructor
	public LoanType() {
		super();
	}

	// parameterized constructor
	public LoanType(int p_amount, int rate, int intrest) {
		super();
		this.p_amount = p_amount;
		this.rate = rate;
		this.intrest = intrest;
	}

	// getters and setters
	public int getP_amount() {
		return p_amount;
	}

	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getIntrest() {
		return intrest;
	}

	public void setIntrest(int intrest) {
		this.intrest = intrest;
	}

	// toString method
	@Override
	public String toString() {
		return "LoanType [p_amount=" + p_amount + ", rate=" + rate + ", intrest=" + intrest + "]";
	}
}
