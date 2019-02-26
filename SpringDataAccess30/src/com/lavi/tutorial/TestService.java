package com.lavi.tutorial;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class TestService {

	 @Autowired
	 private DataSource dataSource;
	 
	 public void printDBInfo() {
		 try {
			 Connection con = dataSource.getConnection();
			 DatabaseMetaData dbmd = con.getMetaData();
			 System.out.println(dbmd.getDatabaseProductName());
			 System.out.println(dbmd.getDefaultTransactionIsolation());
		 }catch(Exception ex) {
			 
		 }
	 }
}
