package com.lavi.tutorial;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank {
	
	/*@Autowired(required=false)
	@Qualifier(value="hdfcBank")
	BankService bankService;*/
	
	/*@Resource
	@Qualifier(value="hdfcBank")
	BankService bankService;*/
	
	/*@Inject //JSR-330
	@Named(value="hdfcBank")*/
	BankService bankService;
	
	
	
	public Bank() {
		System.out.println("Bank zero arg constructor");
	}
	
	@Autowired
	public Bank(@Qualifier(value="hdfcbank") BankService bankService) {
		System.out.println("Bank one arg constructor");
		this.bankService = bankService;
	}

	public BankService getBankService() {
		return bankService;
	}

	public void setBankService(BankService bankService) {
		System.out.println("Setting bankservice to Bank");
		this.bankService = bankService;
	}
	
	

}
