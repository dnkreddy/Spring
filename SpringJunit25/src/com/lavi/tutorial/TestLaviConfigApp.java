package com.lavi.tutorial;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author Naveen Doddipalli
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {LaviConfig.class})
public class TestLaviConfigApp {
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private Person person;
	
	@Test
	public void testPerson() {
		System.out.println(context);
		System.out.println(person);
		assertEquals("LAVITECH", person.getpName());
	}
		
}
