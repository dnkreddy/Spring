package com.lavi.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 
 * @author LaVi Technologies
 *
 */
public class TestBeanConfig {
	
	public static void main(String[] args) {
	    //Spring framework
		System.out.println("In TestBean config");
		 ApplicationContext context = new  AnnotationConfigApplicationContext(BeanConfig.class);
		Person person = (Person) context.getBean("person");	
		System.out.println(person.getPersonName());
	}
}
