package com.lavi.tutorial;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_jdbc.xml")
public class SpringJdbcTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testSpringJdbc() {
		
		EmployeeDao eDao = (EmployeeDao)context.getBean("empdao");
		
		Employee e = new Employee();
		e.setEno(300);
		e.setEname("Naveen1");
		e.setDesig("Director1");
		e.setSal(2000.0);
		eDao.save(e);
		System.out.println("Record inserted successfully...");
	}
}
