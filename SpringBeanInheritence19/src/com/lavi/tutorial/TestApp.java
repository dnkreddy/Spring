package com.lavi.tutorial;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 
 * @author LaVi Technologies
 *
 */
public class TestApp {
	public static void main(String[] args) {
		// Spring framework
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container is starting");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		System.out.println("Spring container started");
	/*	Person person = (Person) context.getBean("person");
		System.out.println(person.getAge());
		System.out.println(person.getPersonName());*/
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println("empId::"+emp.getEmpId());
		System.out.println("empSalary::"+emp.getEmpSalary());
		System.out.println("personName::"+emp.getPersonName());
		
	
	}
}
