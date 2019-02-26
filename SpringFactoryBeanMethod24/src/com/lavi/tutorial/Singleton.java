package com.lavi.tutorial;

public class Singleton {

	 private static Singleton singleton;
	 
	 private Singleton() {
		 System.out.println("private Singleton Constructor");
	 }
	 
	 public synchronized static Singleton getInstance() {
		 System.out.println("Singleton getInstance method");
		 if(singleton == null) {
			 singleton = new Singleton();
		 }
		 return singleton;
	 }
	 
	 
	 public Object clone()throws CloneNotSupportedException
	 {
		 throw new CloneNotSupportedException();
	 }
	 
	 public  Singleton getNonStaticInstance() {
		 System.out.println("getNonStaticInstance method");		 
		 return new Singleton();
	 }
}
