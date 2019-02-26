package com.lavi.springs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(value={"com.lavi.springs.config","com.lavi.springs.mvc"})
public class LaviConfiguration {
	
}
