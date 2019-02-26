package com.lavi.tutorial;
/**
 * 
 * @author LaVi Technologies
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanConfig {
	public static void main(String[] args) {
	    //Spring framework
		 ApplicationContext context = new  AnnotationConfigApplicationContext(BeanConfig.class);
		//Person person = (Person) context.getBean("person");	
	}
}
