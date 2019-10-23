package com.virtusa.studentapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int doorNo;
	private String street;
	
	public Address() {
		super();
	}
	public Address(int doorNo, String street) {
		super();
		this.doorNo = doorNo;
		this.street = street;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	
}
