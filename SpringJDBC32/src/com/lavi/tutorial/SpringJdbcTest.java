package com.lavi.tutorial;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_jdbc.xml")
public class SpringJdbcTest {
	@Autowired
	ApplicationContext context;
	
	//@Test
	public void testSpringJdbcSave() {
		
		EmployeeDao eDao = (EmployeeDao)context.getBean("empdao");
		Employee e = new Employee();
		e.setEno(78);
		e.setEname("SIVA");
		e.setDesig("Director");
		e.setSal(2000.0);
		eDao.save(e);
		
		Employee emp = eDao.get(e.getEno());
		System.out.println("empNo::"+emp.getEno());
		
		String eName = eDao.getEmpNameByName(e.getEno());
		System.out.println("eName::"+eName);
		
		Employee e1 = new Employee();
		e1.setEno(3);
		e1.setEname("LAVITECHNOLOGIES");
		eDao.update(e1);
		System.out.println("Record inserted successfully...");
	}
	
	@Test
	public void testSpringJdbcget() {
		
		EmployeeDao eDao = (EmployeeDao)context.getBean("empdao");		
		List<Employee> list = eDao.getAllEmployees();
		System.out.println("No of Employees::"+list.size());
		//System.out.println("Record inserted successfully...");
		for (Employee employee : list) {
			System.out.println(employee.getEname());
		}
	}
	
	
}
