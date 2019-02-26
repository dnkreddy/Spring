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
	public Person person(Address adr) {
		Person p = new Person("Naveen",30,adr);
		return p;
	}
	
	@Bean
	public Address address() {
		Address addr = new Address();
		addr.setCity("Bangalore");
		addr.setPincode(560016);
		addr.setState("Karnataka");
		return addr;
	}
	
}
