package com.lavi.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value= {"classpath:common.properties","classpath:mysql.properties","classpath:oracle.properties"})
public class BeanConfig {
	
	@Autowired
	private Environment env;
	
	@Value("${password}")
	private String password;
	@Value("${min}")
	private String min;
	@Value("${max}")
	private String max;
	
	@Bean(name="oracleDS")
	public Datasource oracleDataSource(@Value("${oracle.driverclass}") String driverClass,@Value("${oracle.username}") String userName) {
		
		Datasource ds = new Datasource();
		ds.setDriverClass(driverClass);
		ds.setUserName(userName);
		return ds;
	}
	

	@Bean(name="mysqlDS")
	public Datasource mysqlDataSource(@Value("${mysql.driverclass}") String driverClass,@Value("${mysql.username}") String userName) {
		
		Datasource mysqlds = new Datasource();
		mysqlds.setDriverClass(driverClass);
		mysqlds.setUserName(userName);
		return mysqlds;
	}
	
	@Bean
	public BaseDAO baseDAO() {
		
		return new BaseDAO();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeeeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
