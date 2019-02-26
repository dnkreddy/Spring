package com.lavi.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		ArrayList<String> skills = (ArrayList<String>) applicationContext
				.getBean("skills");

		for (String skill : skills)
			System.out.println(skill);

		HashMap<String, String> addresses = (HashMap<String, String>) applicationContext
				.getBean("addresses");
		System.out.println("======Addresss=======");
		System.out.println(addresses.get("permanentAddress"));
		System.out.println(addresses.get("temporaryAddress"));
		System.out.println("====Credentials======");
		Properties properties = (Properties) applicationContext.getBean("credentials");
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));

	}

}