package com.dh.accounts.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class NameType {

	@JsonProperty("firstname")
	private String firstname;
	
	@JsonProperty("lastname")
	private String lastname;
	
	@JsonProperty("surname")
	private String surname;
	
	//default constructor
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
