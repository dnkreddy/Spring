package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
/**
 * 
 * @author LaVi Technologies
 * Java based configuration with out xml
 *
 */
@Configurable
@Import(BankConfig.class)
public class BeanConfig {
   
	//no autowire by constructor
	@Bean
	public Bank bank() {
		return new Bank();
	}
	
	
}
