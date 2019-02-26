package com.lavi.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanConfig {
	public static void main(String[] args) {
		
		// Spring framework
		System.out.println("Spring container is starting");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Spring container started");
		DisplayMessage msg = (DisplayMessage) context.getBean("disMsgBean");
		msg.showInEnglish();
		msg.showInHindi();
		
	}
}
