package com.lavi.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author LaVi Technologies
 * Java based configuration with out xml
 *
 */
@Configuration
public class BeanConfig {
   
	@Bean
	public Bank bank() {
		return new Bank();
	}
	
	@Bean
	public BankService hdfcBank() {  
		return new HDFCBankServiceImpl();
	}
	
	
	@Bean
	public BankService iciciBank() {
		return new ICICIBankServiceImpl();
	}
}
