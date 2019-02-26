package com.lavi.tutorial;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodAround implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation joinpoint) throws Throwable {
		Object obj = null;
		long start = System.currentTimeMillis();
		System.out.println("Method Start time "+new Date(start));
		   obj = joinpoint.proceed();//actual method calling
		long end = System.currentTimeMillis();
		System.out.println("Method end time::"+ new Date(end)+ " milliseconds");
		return obj;
	}
}
