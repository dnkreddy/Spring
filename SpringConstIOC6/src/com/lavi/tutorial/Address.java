package com.lavi.tutorial;

/**
 * 
 * @author LaVi Technologies
 *
 */

public class Address {
	
	private String city;
	private String state;
	private long pincode;
	
	public Address() {
		System.out.println("Address zero arg constructor");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("Address:Setting city");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("Address:Setting state");
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		System.out.println("Adress:setting pincode");
		this.pincode = pincode;
	}
	
}
