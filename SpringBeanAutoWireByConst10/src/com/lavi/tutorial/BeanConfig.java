package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
/**
 * 
 * @author LaVi Technologies
 * Demo on Java based configuration with out xml
 *
 */
@Configurable
public class BeanConfig {
   
	//no autowire by constructor
	@Bean
	public Person person(Address address) {
		Person p = new Person();
		p.setPersonName("Naveen");
		p.setAge(100);
		p.setAddress(address);
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
	
	
	@Bean
	public Address address1() {
		Address addr = new Address();
		addr.setCity("Bangalore1");
		addr.setPincode(560016);
		addr.setState("Karnataka2");
		return addr;
	}
}
