package com.dh.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameType {

	@JsonProperty("firstName")
	private String firstname;

	@JsonProperty("lastName")
	private String lastname;

	@JsonProperty("surName")
	private String surname;

	// default constructor
	public NameType() {
		super();
	}

	// parameterized constructor
	public NameType(String firstname, String lastname, String surname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.surname = surname;
	}

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
		return "NameType [firstname=" + firstname + ", lastname=" + lastname + ", surname=" + surname + "]";
	}

}
