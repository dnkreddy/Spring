package com.lavi.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		
		System.out.println("Spring container is starting");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Bean are ready to service");
		Bank bank = (Bank) context.getBean("bank");
		bank.getBankService().transferFunds();
		bank.getBankService().balanceEnquiry();
		context.registerShutdownHook();
				
	}
}
