package com.lavi.tutorial;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class MAfterReturningAdvice implements AfterReturningAdvice{

	 @Autowired
	 LogService log;
	 @Autowired
	 TxService tx;
	 
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		log.logAfter();;
		tx.commitTx();
		
	}
	

}
