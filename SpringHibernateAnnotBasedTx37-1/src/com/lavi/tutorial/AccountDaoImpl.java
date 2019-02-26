package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Transactional
public class AccountDaoImpl implements AccountDAO{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void deposit(int acctNo, int amt) {
		TransactionDefinition tdef = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
		Account acct = hibernateTemplate.load(Account.class,acctNo);
		int bal = acct.getBal();
	    acct.setBal(bal+amt);	
	    hibernateTemplate.update(acct);
		
	}
	

	@Override
	public void withDraw(int acctNo, int amt) {
		Account acct = hibernateTemplate.load(Account.class,acctNo);
		int bal = acct.getBal();
		if(bal>=amt) {
	    acct.setBal(bal-amt);	
	    hibernateTemplate.update(acct);
		}else {
			System.out.println("Insuffucient Funds");
			throw new InsufficientBalanceException();
		}
		
	}

	@Override
	public void fundsTransfer(int fromAcctNo, int toAcctNo, int amt) {
	    deposit(toAcctNo, amt);	 
	    withDraw(fromAcctNo, amt);
	}

	@Override
	public double getBalance(int acctNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
