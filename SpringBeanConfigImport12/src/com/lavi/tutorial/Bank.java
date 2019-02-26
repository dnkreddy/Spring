package com.lavi.tutorial;

import javax.inject.Inject;
import javax.inject.Named;

public class Bank {
	
	//@Autowired
	//@Qualifier(value="hdfcBank")
	//BankService bankService;
	
	/*@Resource
	@Qualifier(value="hdfcBank")
	BankService bankService;*/
	
	@Inject
	@Named(value="hdfcBank")
	BankService bankService;
	
	public Bank() {
		System.out.println("Bank zero arg constructor");
	}
	
	/*@Autowired
	public Bank(@Qualifier(value="hdfcbank") BankService bankService) {
		System.out.println("Bank one arg constructor");
		this.bankService = bankService;
	}*/

	public BankService getBankService() {
		return bankService;
	}

	public void setBankService(BankService bankService) {
		System.out.println("Setting bankservice to Bank");
		this.bankService = bankService;
	}


}
