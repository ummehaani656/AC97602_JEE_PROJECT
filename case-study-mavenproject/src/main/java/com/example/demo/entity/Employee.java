package com.example.demo.entity;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String 	address;
    private String emailAddress;
	private long phoneNumber;
	private LocalDate birthday;
	private LocalDate weddingAnniversary;
	public Employee() {
		super();

	}
	public Employee(String firstName, String lastName, String address, String emailAddress, long phoneNumber,
			LocalDate birthday, LocalDate weddingAnniversary) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.weddingAnniversary = weddingAnniversary;
	}
	public Employee(String firstName, long phoneNumber)  {
		super();
		
		this.firstName = firstName;
		this.phoneNumber=phoneNumber;
	}
	
	public Employee(String firstName, String emailAddress)  {
		super();
		
		this.firstName = firstName;
		this.emailAddress=emailAddress;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public LocalDate getWeddingAnniversary() {
		return weddingAnniversary;
	}
	public void setWeddingAnniversary(LocalDate weddingAnniversary) {
		this.weddingAnniversary = weddingAnniversary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday
				+ ", weddingAnniversary=" + weddingAnniversary + "]";
	}
	}
	
	
	
	


