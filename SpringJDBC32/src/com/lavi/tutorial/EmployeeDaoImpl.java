package com.lavi.tutorial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	

	public EmployeeDaoImpl() {}

	@Override
	public void save(final Employee emp) {
		//Anonymous approach
		/*PreparedStatementCreator psc = new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				String query = "INSERT INTO employee(eno, ename, desig, sal) VALUES (?,?,?,?)";
				PreparedStatement pstmt =con.prepareStatement(query);
				pstmt.setInt(1, emp.getEno());
				pstmt.setString(2, emp.getEname());
				pstmt.setString(3, emp.getDesig());
				pstmt.setDouble(4, emp.getSal());
				return pstmt;
			}
		};
		getJdbcTemplate().update(psc);*/
		
		//Short cut approach
		String query = "INSERT INTO employee(eno, ename, desig, sal) VALUES (?,?,?,?)";
		Object[] data = {emp.getEno(), emp.getEname(), emp.getDesig(), emp.getSal()};
		getJdbcTemplate().update(query, data);
	}

	@Override
	public void delete(int eno) {
		// TODO Auto-generated method stub
		
	}

	//selecting one row
	@Override
	public Employee get(int eno) {
		String sql = "select * from Employee where eno=?";
		Employee emp = getJdbcTemplate().queryForObject(sql, new EmployeeRowMapper(),eno);
		return emp;
	}
	
	//selecting particular column value
	@Override
	public String getEmpNameByName(int eno) {
		String sql = "select ename from Employee where eno=?";
		String name  = getJdbcTemplate().queryForObject(sql, String.class,eno);
		return name;
	}

	//Get the list of employees
	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		List<Employee> list = getJdbcTemplate().query(sql, new EmployeeRowMapper());
		return list;
	}
	
	@Override
	public void update(Employee e) {
		System.out.println(e.getEno()+"::"+e.getEname());
		String sql ="update employee set ename=? where eno=?";
		getJdbcTemplate().update(sql, e.getEname(),e.getEno());
	}

	
}

