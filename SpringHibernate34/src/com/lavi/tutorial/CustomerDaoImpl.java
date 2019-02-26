package com.lavi.tutorial;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	
	public CustomerDaoImpl() {}
	
	/*@Autowired
	HibernateTemplate hibernateTemplate;*/
	@Autowired
	HibernateTransactionManager  txMgr;
	@Override
	public void save(final Customer c) {
		//anonymous approach
		/*getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				Integer iRef = (Integer) session.save(c);
				return iRef;
			}
		});*/
		// short cut approach
		//getHibernateTemplate().getSessionFactory().openSession().setFlushMode(FlushMode.AUTO);
		TransactionDefinition td = new DefaultTransactionDefinition();
		TransactionStatus sts = txMgr.getTransaction(td);
		getHibernateTemplate().save(c);
		getHibernateTemplate().save(c);
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
	
	@Override
	public void getAll() {
	List list = 	getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Customer.class));
	 System.out.println(list.size());
	}
}
