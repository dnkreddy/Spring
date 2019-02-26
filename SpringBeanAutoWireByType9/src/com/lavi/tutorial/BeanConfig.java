package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
/**
 * 
 * @author LaVi Technologies
 * Java based configuration with out xml
 *
 */
@Configurable
public class BeanConfig {
   
	@Bean(autowire=Autowire.BY_TYPE)
	public Person person() {
		Person p = new Person();
		p.setPersonName("Naveen");
		p.setAge(100);
		//p.setAddress(address1);
		return p;
	}
	
	@Bean(name="address")
	public Address address() {
		Address addr = new Address();
		addr.setCity("Bangalore11");
		addr.setPincode(560016);
		addr.setState("Karnataka");
		return addr;
	}
	
	
}
