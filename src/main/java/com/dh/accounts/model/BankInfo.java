package com.dh.accounts.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class BankInfo {

	@JsonProperty("bankName")
	private String bankName;
	
	@JsonProperty("bankRating")
	private int bankRating;
	
	@JsonProperty("bankCurrency")
	private String bankCurrency;
	
	@Autowired
	@JsonProperty("bankMembers")
	private List<BankMembers> bankMembers;

	//default constructor
	public BankInfo() {
		super();
	}

	// parameterized constructor
	public BankInfo(String bankName, int bankRating, String bankCurrency) {
		super();
		this.bankName = bankName;
		this.bankRating = bankRating;
		this.bankCurrency = bankCurrency;
	}

	//getters and setters
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBankRating() {
		return bankRating;
	}

	public void setBankRating(int bankRating) {
		this.bankRating = bankRating;
	}

	public String getBankCurrency() {
		return bankCurrency;
	}

	public void setBankCurrency(String bankCurrency) {
		this.bankCurrency = bankCurrency;
	}

	public List<BankMembers> getBankMembers() {
		return bankMembers;
	}

	public void setBankMembers(List<BankMembers> bankMembers) {
		this.bankMembers = bankMembers;
	}

	// to string
	@Override
	public String toString() {
		return "BankInfo [bankName=" + bankName + ", bankRating=" + bankRating + ", bankCurrency=" + bankCurrency + "]";
	}
	
	
	
}
