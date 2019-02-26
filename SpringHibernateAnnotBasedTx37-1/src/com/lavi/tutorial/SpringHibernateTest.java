package com.lavi.tutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_Hibernate.xml")
public class SpringHibernateTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testdeposit() {
		AccountDAO acctDao = (AccountDAO) context.getBean("acctdao");
		acctDao.deposit(100, 5);
	}
	
	
	@Test
	public void testfundTransfer() {
		AccountDAO acctDao = (AccountDAO) context.getBean("acctdao");
		acctDao.fundsTransfer(100,101,5000);
	}
}
