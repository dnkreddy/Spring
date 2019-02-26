package com.lavi.tutorial;

import java.util.List;

//EmployeeDao.java
public interface EmployeeDao {
	public void save(Employee e);

	public void update(Employee e);

	public void delete(int eno);

	public Employee get(int eno);
	
	public List<Employee> getAllEmployees();
	
	public String getEmpNameByName(int eno);
}
