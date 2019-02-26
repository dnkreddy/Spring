package com.lavi.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/**
 * 
 * @author LaVi Technologies
 * Demo on Java based configuration with out xml
 *
 */
@Configuration
@ImportResource("applicationContext.xml")
public class BeanConfig {
   
	@Bean
	public Bank bank() {
		return new Bank();
	}
	
	@Bean
	public HDFCBankServiceImpl hdfcbank() {
		return new HDFCBankServiceImpl();
	}
	
	
	@Bean
	public ICICIBankServiceImpl icicibank() {
		return new ICICIBankServiceImpl();
	}
	
}
