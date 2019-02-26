package com.lavi.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaviConfig {

	@Bean
	public Person person() {
		Person p = new Person();
		p.setpName("LAVITECH");
		return p;
	}

}
