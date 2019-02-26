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
	public void testSpringHibernate() {
		CustomerDao custDao = (CustomerDao) context.getBean("customerdao");
		Customer c = new Customer();
		c.setCno(222);
		c.setCname("LAVI");
		c.setAddress("Bangalore");
		c.setPhone(808080808);
		try {
		//custDao.save(c);
		custDao.getAll();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
