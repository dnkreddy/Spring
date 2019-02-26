package com.lavi.tutorial;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {

	private List<String> skills;
	private Map<String, String> addresses;
	private Properties credentials;
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Map<String, String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Map<String, String> addresses) {
		this.addresses = addresses;
	}

	public Properties getCredentials() {
		return credentials;
	}

	public void setCredentials(Properties credentials) {
		this.credentials = credentials;
	}

}