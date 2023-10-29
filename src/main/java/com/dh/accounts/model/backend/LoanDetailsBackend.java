package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name = "loan")		// Separate xml root tag
public class LoanDetailsBackend {

	@XmlElement
	private int p_amount;
	
	@XmlElement
	private int rate;
	
	@XmlElement
	private int intrest;

	
	// default constructor
	public LoanDetailsBackend() {
		super();
	}
	
	// parameterized constructor
	public LoanDetailsBackend(int p_amount, int rate, int intrest) {
		super();
		this.p_amount = p_amount;
		this.rate = rate;
		this.intrest = intrest;
	}



	//getters and setters
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

	//toString method
	@Override
	public String toString() {
		return "LoanDetailsBackend [p_amount=" + p_amount + ", rate=" + rate + ", intrest=" + intrest + "]";
	}
	
}
