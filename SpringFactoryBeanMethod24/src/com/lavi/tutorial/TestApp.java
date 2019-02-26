package com.lavi.tutorial;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.lavi.tutorial.Person;

/**
 * 
 * @author Lavi Technologies
 *
 */
public class TestApp {
	public static void main(String[] args) {
		// Basic Spring Container
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"src/applicationContext.xml"));*/
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		
		/*Singleton singleton = (Singleton) factory.getBean("single");
		System.out.println(singleton);
		System.out.println("static method");
		Singleton singleton3 = (Singleton) factory.getBean("single1");
		System.out.println("Person bean");
		//Person person = (Person) factory.getBean("person");*/
		Person person1 = (Person) factory.getBean("person1");
	}
}
