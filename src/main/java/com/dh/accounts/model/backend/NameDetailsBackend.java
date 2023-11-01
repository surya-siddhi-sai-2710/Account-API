package com.dh.accounts.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Name")
public class NameDetailsBackend {

	@XmlElement(name = "Firstname")
	private String firstname;

	@XmlElement(name = "Lastname")
	private String lastname;

	@XmlElement(name = "Surname")
	private String surname;

	// getters and setters
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	// toString method
	@Override
	public String toString() {
		return "NameDetailsBackend [firstname=" + firstname + ", lastname=" + lastname + ", surname=" + surname + "]";
	}

}
