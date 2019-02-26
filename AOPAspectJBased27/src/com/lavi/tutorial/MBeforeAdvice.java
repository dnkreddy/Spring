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
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		log.logBefore();
		tx.beginTx();
	}

}
