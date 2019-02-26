package com.lavi.tutorial;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanConfig {
	public static void main(String[] args) {
	    //Spring framework
		System.out.println("In TestBean config");
		 ApplicationContext context = new  AnnotationConfigApplicationContext(BeanConfig.class);
		Person person = (Person) context.getBean("person");	
		System.out.println("Name::"+person.getPersonName());
		
		List<Address>  list = person.getAddrs();
		list.forEach(val->System.out.println(val.getCity()));
		
		Set<Long>  phoneNos = person.getPhonenos();
		phoneNos.forEach(val->System.out.println(val));
		
		Map map = person.getPhoneMap();
		System.out.println(map);
	}
}
