package com.lavi.tutorial;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean{

	@Override
	public Object getObject() throws Exception {
		 System.out.println("Factory bean GetObject method");
		return new Person();
	}

	@Override
	public Class getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
