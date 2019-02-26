package com.lavi.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
/**
 * 
 * @author LaVi Technologies
 * Demo on Java based configuration with out xml
 *
 */
@Configurable
public class BeanConfig {
   
	@Bean
	@Scope(value="singleton")
	@Lazy(value=true)
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
	
	@Bean(name="emails")
	public List<String> emails(){
		List<String> emails = new ArrayList<>();
		emails.add("AAAA");
		emails.add("BBB");
		return emails;
	}
	@Bean
	public Set<Long> phoneNos(){
		Set<Long> phnos = new HashSet<>();
		phnos.add(Long.valueOf(1111));
		phnos.add(Long.valueOf(2222));
		return phnos;
	}
	
	@Bean
	public Map<String,Long> phoneMap(){
		Map<String,Long> map = new HashMap<>();
		map.put("AAA", Long.valueOf(111));
		map.put("BBB", Long.valueOf(222));
		return map;
	}
	
	@Bean(name="prop")
	public Properties properties() {
		Properties prop = new Properties();
		prop.put("A",1111);
		prop.put("B", 2222);
		return prop;
	}
	
	@Bean
	public List<Address> addrs(){
		
		List<Address> adrList = new ArrayList<>();
		
		Address a1 = new Address();
		a1.setCity("bangalore1");
		a1.setPincode(1111);
		a1.setState("Karnataka");
		
		Address a2 = new Address();
		a2.setCity("bangalore2");
		a2.setPincode(2222);
		a2.setState("Karnataka");
		
		adrList.add(a1);
		adrList.add(a2);
		
		return adrList;
		
	}
}
