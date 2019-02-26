package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
/**
 * 
 * @author LaVi Technologies
 *
 */
@Configurable
public class BankConfig {
	
	@Bean
	public BankService hdfcBank() {
		return new HDFCBankServiceImpl();
	}
	
	@Bean
	public BankService iciciBank() {
		return new ICICIBankServiceImpl();
	}
}
