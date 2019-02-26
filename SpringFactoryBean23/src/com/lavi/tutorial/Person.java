package com.lavi.tutorial;
/**
 * 
 * @author LaVi Technologies
 *
 */
public class Person {
	
	Person(){
		System.out.println("Person zero args constructor");
	}
	
	Person(String name){
		System.out.println("Person one args constructor::"+name);
	}
	
	public Person getPerson() {
		System.out.println("getPerson instance method");
		return new Person("LAVI");
	}
	
	
}
