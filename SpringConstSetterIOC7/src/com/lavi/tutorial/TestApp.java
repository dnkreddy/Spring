package com.lavi.tutorial;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 
 * @author LaVi Technologies
 *
 */
public class TestApp {
	public static void main(String[] args) {
		// Spring framework
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container is starting");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		System.out.println("Spring container started");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getPersonName());
		List<String>  list = person.getEmails();
		list.forEach(val->System.out.println(val));
		Set<Long>  phoneNos = person.getPhonenos();
		phoneNos.forEach(val->System.out.println(val));
		
	}
}
