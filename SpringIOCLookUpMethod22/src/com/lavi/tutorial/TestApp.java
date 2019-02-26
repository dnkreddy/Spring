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
		
		A a = (A) factory.getBean("id1");
		A a1 = (A) factory.getBean("id1");
		a.m1();
		a1.m1();
	}
}
