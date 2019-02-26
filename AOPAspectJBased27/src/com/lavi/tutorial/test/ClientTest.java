package com.lavi.tutorial.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lavi.tutorial.AccountService;

public class ClientTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_proxy_based_aop.xml");
		//AccountService service = (AccountService) context.getBean("target");
		 AccountService service = (AccountService) context.getBean("target1");
		//service.transferFunds();
		service.getBalance();
		//service.addBenefeciary();
	}
}
