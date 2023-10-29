package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "account")
public class AccountDetailsBackendResponse {
	
	@XmlElement(name="accno")
	private int accno;
	
	@XmlElement(name="name")
	private NameDetailsBackend name;
	
	@XmlElement(name="phoneno")
	private int phoneno;
	
	@XmlElement(name="gender")
	private String gender;
	
	@XmlElement(name="amount")
	private int amount;
	
	@Autowired
	@XmlElement(name="loan")
	private LoanDetailsBackend loan;
	
	@XmlElement(name="branch")
	private String branch;
	
	@XmlElement(name="zipcode")
	private int zipcode;

	//getters and setters
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public NameDetailsBackend getName() {
		return name;
	}

	public void setName(NameDetailsBackend name) {
		this.name = name;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LoanDetailsBackend getLoan() {
		return loan;
	}

	public void setLoan(LoanDetailsBackend loan) {
		this.loan = loan;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	//toString method
	@Override
	public String toString() {
		return "AccountDetailsBackendResponse [accno=" + accno + ", name=" + name + ", phoneno=" + phoneno + ", gender="
				+ gender + ", amount=" + amount + ", loan=" + loan + ", branch=" + branch + ", zipcode=" + zipcode
				+ "]";
	}
	
}
