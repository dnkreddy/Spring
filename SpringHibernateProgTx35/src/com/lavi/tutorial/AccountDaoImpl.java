package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class AccountDaoImpl implements AccountDAO{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private PlatformTransactionManager txManager;
	
	@Override
	public void deposit(int acctNo, int amt) {
		TransactionStatus ts = null;
		try {
		TransactionDefinition tdef = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
		ts = txManager.getTransaction(tdef);
		Account acct = hibernateTemplate.load(Account.class,acctNo);
		int bal = acct.getBal();
	    acct.setBal(bal+amt);	
	    hibernateTemplate.update(acct);
	    txManager.commit(ts);
	    
		}catch (Exception e) {
			e.printStackTrace();
			txManager.rollback(ts);
		}
	}
	

	@Override
	public void withDraw(int acctNo, int amt) {
		TransactionStatus ts = null;
		try {
		//TransactionDefinition tdef = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionDefinition tdef = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
		ts = txManager.getTransaction(tdef);
		Account acct = hibernateTemplate.load(Account.class,acctNo);
		int bal = acct.getBal();
		if(bal>=amt) {
	    acct.setBal(bal-amt);	
	    hibernateTemplate.update(acct);
		}else {
			System.out.println("Insuffucient Funds");
			throw new InsufficientBalanceException();
		}
	    txManager.commit(ts);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Transaction getting rollback");
			txManager.rollback(ts);
		}
		
	}

	@Override
	public void fundsTransfer(int fromAcctNo, int toAcctNo, int amt) {
		TransactionStatus ts = null;
		try {
		//Propogating txs to deposit and withDraw methods	
		TransactionDefinition tdef = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
		ts = txManager.getTransaction(tdef);
	    deposit(toAcctNo, amt);	 
	    withDraw(fromAcctNo, amt);
	    txManager.commit(ts);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Transaction getting rollback");
			txManager.rollback(ts);
		}
	}

	@Override
	public double getBalance(int acctNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
