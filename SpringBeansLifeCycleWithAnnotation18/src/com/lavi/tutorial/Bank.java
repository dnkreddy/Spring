package com.lavi.tutorial;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bank implements BeanNameAware,ApplicationContextAware,
BeanFactoryAware,InitializingBean{
		
	@Autowired
	@Qualifier(value="hdfcbank")
	BankService bankService;
	
	public Bank() {
		System.out.println("Bank zero arg constructor");
	}
	
	public BankService getBankService() {
		return bankService;
	}

	public void setBankService(BankService bankService) {
		System.out.println("Setting bankservice to Bank");
		this.bankService = bankService;
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory::"+arg0);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setApplicationContext::"+arg0);
		
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName::"+arg0);
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method");
		
	}

}
