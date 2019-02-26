package com.lavi.tutorial;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

/**
 * 
 * @author LaVi Technologies
 *
 */
public class Person {
	
	private String personName;
	private int age;
	Address address;
	
	//if there is mismatch b/w property name and methodname in Beanconfig
	//use name attribute for Bean and Resource
	@Resource(name="emails")
	private List<String> emails;
	
	@Resource(name="phoneNos")
	private Set<Long> phonenos;
	
	private Map<String,Long> phoneMap;
	
	private Properties prop;
	
	@Resource
	private List<Address> addrs;
	
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
	public Person(Address ad) {
		this.address = ad;
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

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Long> getPhonenos() {
		return phonenos;
	}

	public void setPhonenos(Set<Long> phonenos) {
		this.phonenos = phonenos;
	}

	public Map<String, Long> getPhoneMap() {
		return phoneMap;
	}

	public void setPhoneMap(Map<String, Long> phoneMap) {
		this.phoneMap = phoneMap;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public List<Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(List<Address> addrs) {
		this.addrs = addrs;
	}
	
}
