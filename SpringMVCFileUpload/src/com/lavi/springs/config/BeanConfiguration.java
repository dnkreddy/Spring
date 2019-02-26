package com.lavi.springs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
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
	public CommonsMultipartResolver multipartResolver(){
		CommonsMultipartResolver resolver =  new CommonsMultipartResolver();
		resolver.setMaxUploadSize(4000*1024);
		return resolver;
	}
	
}
