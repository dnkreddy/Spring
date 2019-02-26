package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
/**
 * 
 * @author LaVi Technologies
 * Java based configuration with out xml
 *
 */
@Configurable
public class BeanConfig {
   
	//autowire by Name
	@Bean(autowire=Autowire.BY_NAME)
	public Person person() {
		Person p = new Person();
		p.setPersonName("Naveen");
		p.setAge(100);
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
