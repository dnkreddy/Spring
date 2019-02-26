package com.lavi.tutorial.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lavi.tutorial.LaviConfig;
import com.lavi.tutorial.TestService;

public class ClientConfigTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				LaviConfig.class);
		 TestService service = (TestService) context.getBean("testService");
		 System.out.println(service);
		 service.printDBInfo();
	}
}
