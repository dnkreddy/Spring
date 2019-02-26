package com.lavi.springs.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
/*@EnableWebMvc*/
@ComponentScan(value={"com.lavi.springs.mvc","com.lavi.springs.service"})
public class LaviConfiguration {
	
}
