package com.lavi.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBeanConfig {
	public static void main(String[] args) {
		
		// Spring framework
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container is starting");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Spring container started");
		Bank bank = (Bank) context.getBean("bank");
		bank.getBankService().transferFunds();
		bank.getBankService().balanceEnquiry();
		
	}
}
