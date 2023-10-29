package com.dh.accounts.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class BankMembers {

	@JsonProperty("emp1")
	private String emp1;
	
	@JsonProperty("emp2")
	private String emp2;
	
	@JsonProperty("emp3")
	private String emp3;

	//default constructor
	public BankMembers() {
		super();
	}

	//parameterized constructor
	public BankMembers(String emp1, String emp2, String emp3) {
		super();
		this.emp1 = emp1;
		this.emp2 = emp2;
		this.emp3 = emp3;
	}

	//getters and setters
	public String getEmp1() {
		return emp1;
	}

	public void setEmp1(String emp1) {
		this.emp1 = emp1;
	}

	public String getEmp2() {
		return emp2;
	}

	public void setEmp2(String emp2) {
		this.emp2 = emp2;
	}

	public String getEmp3() {
		return emp3;
	}

	public void setEmp3(String emp3) {
		this.emp3 = emp3;
	}

	//to String
	@Override
	public String toString() {
		return "BankMembers [emp1=" + emp1 + ", emp2=" + emp2 + ", emp3=" + emp3 + "]";
	}
	
}
