package com.lavi.tutorial;

public abstract class A {
	
	public A() {
		System.out.println("A 0 arg constructor");
	}
	public abstract B getObjectOfB();

	public void m1() {
		getObjectOfB().display();
	}
}
