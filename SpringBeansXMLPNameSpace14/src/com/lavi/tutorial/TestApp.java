package com.lavi.tutorial;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * @author Naveen Doddipalli
 *
 */
public class TestApp {
	public static void main(String[] args) {
		// Basic Spring Container
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"src/applicationContext.xml"));*/
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		
		Person person = (Person) factory.getBean("person");
		System.out.println("personName:"+person.getPersonName());
		System.out.println("personAge:"+person.getAge());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getPincode());
		
		
		
	}
}
