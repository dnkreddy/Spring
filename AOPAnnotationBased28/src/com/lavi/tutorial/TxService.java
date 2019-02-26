package com.lavi.tutorial;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class TxService {
	
	@Pointcut(value="execution(* com.lavi.tutorial.AccountService.*(..))")
	public void pc1() {
		
	}
	
	@Before("pc1()")
	public void beginTx() {
      System.out.println("TxService::"+"Transaction begin");
	}
    @AfterReturning("pc1()")
	public void commitTx() {
		 System.out.println("TxService::"+"Transaction committed");
	}
    @AfterThrowing("pc1()")
	public void rollbackTx() {
		 System.out.println("TxService::"+"Transaction rollback");
	}
   
    @After("pc1()")
	public void finallyTx() {
		 System.out.println("TxService::"+"finally block");
	}
}
