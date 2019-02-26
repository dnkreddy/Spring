package com.lavi.tutorial;
/**
 * 
 * @author LaVi Technologies
 * This is target in AOP
 *
 */
public interface AccountService {
	public void transferFunds()throws InsufficientBalanceException;
	public void getBalance();
	public void addBenefeciary()throws Exception;
}
