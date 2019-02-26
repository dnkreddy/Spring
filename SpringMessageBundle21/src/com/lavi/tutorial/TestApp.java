package com.lavi.tutorial;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 
 * @author LaVi Technologies
 *
 */
public class TestApp {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		// Spring framework
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container is starting");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		System.out.println("Spring container started");
		
		DisplayMessage msg = (DisplayMessage) context.getBean("disMsgBean");
		msg.showInEnglish();
		msg.showInHindi();
	}
}
