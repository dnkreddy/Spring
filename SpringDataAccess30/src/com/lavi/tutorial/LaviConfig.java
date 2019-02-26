package com.lavi.tutorial;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class LaviConfig {

	  @Bean
	  public DataSource dataSource() {
		  DriverManagerDataSource ds = new DriverManagerDataSource();	  
				  ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
				  ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
				  ds.setUsername("System");
				  ds.setPassword("Lavi@123");
				  return ds;		  
	  }
	  
	  @Bean
	  public TestService testService() {
		  return new TestService();
	  }
}
