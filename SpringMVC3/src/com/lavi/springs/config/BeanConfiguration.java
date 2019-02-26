package com.lavi.springs.config;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(value={"com.lavi.springs.mvc",
		"com.lavi.springs.service",
		"com.lavi.springs.exception"})
public class BeanConfiguration {

	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResoler = new InternalResourceViewResolver();
		viewResoler.setViewClass(InternalResourceView.class);
		viewResoler.setPrefix("/");
		viewResoler.setSuffix(".jsp");
		return viewResoler;
	}
	
	@Bean
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource msgSource = new ReloadableResourceBundleMessageSource();
		msgSource.setBasename("classpath:messages");
		msgSource.setDefaultEncoding("UTF-8");
		return msgSource;
	}
	
	//1st way
	/*@Bean
	public SimpleMappingExceptionResolver exceptionResolver(){
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		Properties map = new Properties();
		map.put("com.lavi.springs.exception.SIDNotFoundException", "sidsearch1");
		//map.put("com.lavi.springs.exception.SIDNotFoundException", "sidsearch1");
		resolver.setExceptionMappings(map);
		return resolver;
	}*/
}
