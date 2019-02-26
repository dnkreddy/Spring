package com.lavi.tutorial;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.lavi.tutorial.Person;

/**
 * 
 * @author LaVi Technologies
 *
 */
public class TestApp {
	public static void main(String[] args) {
		// Basic Spring Container
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"src/applicationContext.xml"));*/
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		
		//MyFactoryBean singleton = (MyFactoryBean) factory.getBean("factoryBean");
		Person person = (Person) factory.getBean("factoryBean");
		System.out.println(person);
		
	}
}
