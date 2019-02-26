package com.lavi.tutorial;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {
	
	@Pointcut(value="execution(* *com.lavi.tutorial.AccountService.*(..))")
	public void pc1() {
		
	}
	
	@Before(value="pc1()")
    public void logBefore(JoinPoint jp) {
    	System.out.println("LogService::"+" method starts::"+jp.getSignature().getName());
    }
    
	@AfterReturning(pointcut="pc1()",returning="val")
    public void logAfter(JoinPoint jp,Object val) {
    	System.out.println("LogService::"+" method ends");
    }
    
	@AfterThrowing(pointcut="pc1()",throwing="ex")
    public void logThrowing(JoinPoint jp,Throwable ex) {
    	System.out.println("LogService::"+"Exception occured::");
    }
	
	 @After("pc1()")
		public void finallylog(JoinPoint jp) {
			 System.out.println("LogService::"+"finally block");
		}
}
