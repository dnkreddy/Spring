package com.lavi.tutorial;

public class AccountServiceImpl implements AccountService{

	@Override
	public void transferFunds()throws InsufficientBalanceException {
		System.out.println("Transfer Funds starts");
		if(1==1)
			throw new InsufficientBalanceException();
		System.out.println("Transfer Funds Ends");
	}

	@Override
	public void getBalance() {
		System.out.println("BalanceEnquiry  starts");
		System.out.println("BalanceEnquiry  Done");
		System.out.println("BalanceEnquiry  Ends");
	}

	@Override
	public void addBenefeciary() {
		System.out.println("Add Beneficiary bussiness logic");
	}
}
