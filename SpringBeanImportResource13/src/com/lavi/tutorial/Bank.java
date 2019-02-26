package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank {
		
	@Autowired
	@Qualifier(value="hdfcbank")
	BankService bankService;
	
	public Bank() {
		System.out.println("Bank zero arg constructor");
	}
	
	public BankService getBankService() {
		return bankService;
	}

	public void setBankService(BankService bankService) {
		System.out.println("Setting bankservice to Bank");
		this.bankService = bankService;
	}
	
	

}
