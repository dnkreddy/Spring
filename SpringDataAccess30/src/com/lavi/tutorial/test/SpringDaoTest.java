package com.lavi.tutorial.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lavi.tutorial.Account;
import com.lavi.tutorial.AccountDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_DA.xml")
public class SpringDaoTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testSpringDao() {
		AccountDao accDao = (AccountDao)context.getBean("accountDao");
		
		Account account = new Account();
		account.setAccno(23);
		account.setAccName("LAVI");
		account.setAccType("SAVINGS");
		account.setBal(5000.00);
		
		accDao.save(account);
		
		int i = 1;
		
		assertEquals(1, 2);
		
	}
}
