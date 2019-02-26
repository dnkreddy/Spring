package com.lavi.tutorial;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDAO {
	
	@Autowired
	@Qualifier("oracleDS")
	Datasource oracleDS;
	
	@Resource(name="mysqlDS")
	Datasource mysqlDS;
	
	public void show() {
		System.out.println("OracleDs::"+oracleDS.getDriverClass());
		System.out.println("myaqlDS::"+mysqlDS.getDriverClass());
	}

	public Datasource getOracleDS() {
		return oracleDS;
	}

	public void setOracleDS(Datasource oracleDS) {
		this.oracleDS = oracleDS;
	}

	public Datasource getMysqlDS() {
		return mysqlDS;
	}

	public void setMysqlDS(Datasource mysqlDS) {
		this.mysqlDS = mysqlDS;
	}
	
	

}
