package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BankMember") // sub root between loop elements
public class BankMembersBackend {

	@XmlElement(name = "Emp1")
	private String emp1;

	@XmlElement(name = "Emp2")
	private String emp2;

	@XmlElement(name = "Emp3")
	private String emp3;

	// default constructor
	public BankMembersBackend() {
		super();
	}

	// parameterized constructor
	public BankMembersBackend(String emp1, String emp2, String emp3) {
		super();
		this.emp1 = emp1;
		this.emp2 = emp2;
		this.emp3 = emp3;
	}

	// getters and setters
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

	// to String
	@Override
	public String toString() {
		return "BankMembersBackend [emp1=" + emp1 + ", emp2=" + emp2 + ", emp3=" + emp3 + "]";
	}
}
