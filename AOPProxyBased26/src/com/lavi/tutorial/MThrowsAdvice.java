package com.lavi.tutorial;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class MThrowsAdvice implements ThrowsAdvice{
	 @Autowired
	 LogService log;
	 @Autowired
	 TxService tx;
	 public void afterThrowing(Method method, Object[] data, Object target,
				Exception e) {
		tx.rollbackTx();
		log.logThrowing(e);
	}
}
