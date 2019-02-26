package com.lavi.tutorial;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class LaviConfig {

	 /* @Bean
	  public AnnotationAwareAspectJAutoProxyCreator autoProxyCreator() {
		  return new AnnotationAwareAspectJAutoProxyCreator();
	  }*/
	  
	  @Bean
	  public LogService logService() {
		  
		  return new LogService();
	  }
	  
	  @Bean
	  public TxService txService() {
		  
		  return new TxService();
	  }
	  
	  @Bean(name="target")
	  public AccountService accountService() {
		  return new AccountServiceImpl();
	  }
}
