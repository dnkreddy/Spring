package com.lavi.tutorial;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;

public class DisplayMessage {
	
	@Autowired
	ApplicationContext context;
	
	void showInEnglish() {
		
		String m1 = context.getMessage("username.required",null,Locale.US);
		System.out.println(m1);
		String m2 = context.getMessage("password.required",new Object[]{"Password"},Locale.US);
		System.out.println(m2);
		
		String m3 = context.getMessage("min.range",new Object[]{"Password","8"},new Locale("en"));
		System.out.println(m3);
		String m4 = context.getMessage("max.range",new Object[]{"Password","16"},new Locale("en"));
		System.out.println(m4);
		
	}
	
	
void showInHindi() {
		Locale loc = new Locale("hi");
		String m1 = context.getMessage("username.required",null,loc);
		System.out.println(m1);
		String m2 = context.getMessage("password.required",new Object[]{"Password"},loc);
		System.out.println(m2);
		
		String m3 = context.getMessage("min.range",new Object[]{"Password","8"},loc);
		System.out.println(m3);
		String m4 = context.getMessage("max.range",new Object[]{"Password","16"},loc);
		System.out.println(m4);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
