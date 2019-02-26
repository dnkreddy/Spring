package com.lavi.tutorial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee emp = new Employee();
		emp.setEno(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setDesig(rs.getString(3));
		emp.setSal(rs.getDouble(4));
		return emp;
	}

}
