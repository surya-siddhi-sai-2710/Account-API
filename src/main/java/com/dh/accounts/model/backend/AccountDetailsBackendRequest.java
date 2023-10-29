package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "account")
public class AccountDetailsBackendRequest {

	@XmlElement(name="accno")
	private int accno;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	@Override
	public String toString() {
		return "AccountDetailsBackendRequest [accno=" + accno + "]";
	}
	
}
