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
		//Person person = (Person) context.getBean("person");
		//Person person1 = (Person) context.getBean("person");
		/*System.out.println("personName:"+person.getPersonName());
		System.out.println("personAge:"+person.getAge());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getPincode());*/
		
		
		
	}
}
