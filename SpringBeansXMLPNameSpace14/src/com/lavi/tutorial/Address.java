package com.lavi.tutorial;

/**
 * 
 * @author laVi Technologies
 *
 */

public class Address {
	
	private String city;
	private String state;
	private String pincode;
	
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		System.out.println("Address:Setting pincode");
		this.pincode = pincode;
	}
	
	

}
