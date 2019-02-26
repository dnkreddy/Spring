package com.lavi.tutorial;

import org.aspectj.lang.JoinPoint;

public class LogService {
	
    public void logBefore(JoinPoint point) {
    	System.out.println(point.getSignature().getName());
    	Object[] args = point.getArgs();
    	System.out.println("LogService::"+" method starts");
    }
    
    public void logAfter() {
    	System.out.println("LogService::"+" method ends");
    }
    
    public void logThrowing() {
    	System.out.println("LogService::"+"Exception occured::");
    }
	
	public void finallylog() {
			 System.out.println("LogService::"+"finally block");
		}
}
