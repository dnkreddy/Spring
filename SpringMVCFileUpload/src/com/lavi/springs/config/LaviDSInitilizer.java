package com.lavi.springs.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LaviDSInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{BeanConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{LaviConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.lavi"};
	}

}
