package com.lavi.tutorial.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lavi.tutorial.TestService;

public class ClientTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_DA.xml");
		 TestService service = (TestService) context.getBean("ts");
		 service.printDBInfo();
	}
}
