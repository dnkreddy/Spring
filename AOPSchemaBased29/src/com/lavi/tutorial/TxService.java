package com.lavi.tutorial;

public class TxService {
	
	public void beginTx() {
      System.out.println("TxService::"+"Transaction begin");
	}
	public void commitTx() {
		 System.out.println("TxService::"+"Transaction committed");
	}
	public void rollbackTx() {
		 System.out.println("TxService::"+"Transaction rollback");
	}
   
	public void finallyTx() {
		 System.out.println("TxService::"+"finally block");
	}
}
