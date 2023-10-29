package com.dh.accounts.model;

public class Accounts {

	//parameters
	private int accno;
	private NameType name;
	private int phoneno;
	private String gender;
	private int amount;
	private LoanType loan;
	private String branch;
	private int zipcode;
	
	// default constructor
	public Accounts() {
		super();
	}
	
	// parameterized constructor
	public Accounts(int accno, NameType name, int phoneno, String gender, int amount, LoanType loan, String branch,
			int zipcode) {
		super();
		this.accno = accno;
		this.name = name;
		this.phoneno = phoneno;
		this.gender = gender;
		this.amount = amount;
		this.loan = loan;
		this.branch = branch;
		this.zipcode = zipcode;
	}

	// getters and setters
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public NameType getName() {
		return name;
	}

	public void setName(NameType name) {
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

	public LoanType getLoan() {
		return loan;
	}

	public void setLoan(LoanType loan) {
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
		return "Accounts [accno=" + accno + ", name=" + name + ", phoneno=" + phoneno + ", gender=" + gender
				+ ", amount=" + amount + ", loan=" + loan + ", branch=" + branch + ", zipcode=" + zipcode + "]";
	}

}
