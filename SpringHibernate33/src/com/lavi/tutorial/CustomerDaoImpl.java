package com.lavi.tutorial;
//CustomerDaoImpl.java
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component("customerdao")
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	HibernateTransactionManager  txMgr;

	public CustomerDaoImpl() {}

	@Override
	public void save(final Customer c) {
		//anonymous approach
		/*hibernateTemplate.execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				Integer iRef = (Integer) session.save(c);
				return iRef;
			}
		});*/

		// short cut approach
		TransactionDefinition td = new DefaultTransactionDefinition();
		TransactionStatus sts = txMgr.getTransaction(td);
		hibernateTemplate.persist(c);
		txMgr.commit(sts);
	}

	@Override
	public void delete(int eno) {
	}

	@Override
	public Customer get(int eno) {
		return null;
	}

	@Override
	public void update(Customer e) {
	}
}
