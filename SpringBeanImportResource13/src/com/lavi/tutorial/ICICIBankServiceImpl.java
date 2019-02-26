package com.lavi.tutorial;

public class ICICIBankServiceImpl implements BankService{

	@Override
	public void transferFunds() {
		System.out.println("ICICI Transfer Funds");
		
	}
	
	@Override
	public void balanceEnquiry() {
		System.out.println("ICICI Balance Enquiry");
		
	}
}
