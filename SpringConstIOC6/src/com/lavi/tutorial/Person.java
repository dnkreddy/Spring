package com.lavi.tutorial;
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
	
	public Person(String pName) {
		System.out.println("Person one arg constructor");
		this.personName = pName;
	}
	
	public Person(String pName, int age) {
		System.out.println("Person two arg constructor");
		this.personName = pName;
		this.age = age;
	}
	
	public Person(String pName, int age, Address addr) {
		System.out.println("Person three arg constructor");
		this.personName = pName;
		this.age = age;
		this.address = addr;
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
