package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author LaVi Technologies
 *
 */
public class Person {
	
	private String personName;
	private int age;
	Address address;
	
	public Person() {
		System.out.println("Person zero arg constructor");
	}
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		//Setting personName
		System.out.println("Setting personName");
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Address");
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
