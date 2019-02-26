package com.lavi.tutorial;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class MBeforeAdvice implements MethodBeforeAdvice{

	 @Autowired
	 LogService log;
	 @Autowired
	 TxService tx;
	 
	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
		//log.logBefore();
		//tx.beginTx();
		System.out.println(method.getName() +"is started on target "+target);
	}

}
