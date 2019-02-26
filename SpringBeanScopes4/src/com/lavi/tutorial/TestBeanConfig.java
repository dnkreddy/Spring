package com.lavi.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Test Java Based configuration
 * @author LaVi Technologies
 *
 */
public class TestBeanConfig {
	public static void main(String[] args) {
		
	    //Spring framework
		 ApplicationContext context = new  AnnotationConfigApplicationContext(BeanConfig.class);
		//Person person = (Person) context.getBean("person");
		/*System.out.println("personName:"+person.getPersonName());
		System.out.println("personAge:"+person.getAge());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getPincode());*/
		
	}
}
