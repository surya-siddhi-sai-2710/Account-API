package com.dh.accounts.model.backend;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BankInfo")
public class BankInfoBackend {

	@XmlElement(name = "BankName")
	private String bankName;

	@XmlElement(name = "BankRating")
	private int bankRating;

	@XmlElement(name = "BankCurrency")
	private String bankCurrency;

	@Autowired
	@XmlElement(name = "BankMembers") // main element in loop
	private List<BankMembersBackend> bankMembersBackend;

	// default constructor
	public BankInfoBackend() {
		super();
	}

	// parameterized constructor
	public BankInfoBackend(String bankName, int bankRating, String bankCurrency) {
		super();
		this.bankName = bankName;
		this.bankRating = bankRating;
		this.bankCurrency = bankCurrency;
	}

	// getters and setters
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

	public List<BankMembersBackend> getBankMembersBackend() {
		return bankMembersBackend;
	}

	public void setBankMembersBackend(List<BankMembersBackend> bankMembersBackend) {
		this.bankMembersBackend = bankMembersBackend;
	}

	// to string
	@Override
	public String toString() {
		return "BankInfoBackend [bankName=" + bankName + ", bankRating=" + bankRating + ", bankCurrency=" + bankCurrency
				+ "]";
	}

}
