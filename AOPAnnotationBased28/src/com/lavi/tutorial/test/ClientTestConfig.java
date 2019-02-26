package com.lavi.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lavi.tutorial.AccountService;
import com.lavi.tutorial.LaviConfig;

public class ClientTestConfig {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				LaviConfig.class);
		//AccountService service = (AccountService) context.getBean("target");
		 AccountService service = (AccountService) context.getBean("target");
		//service.transferFunds();
		//service.getBalance();
		service.addBenefeciary();
	}
}
