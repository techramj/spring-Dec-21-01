package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.easylearning.entity.Employee;


public class EmpDaoWithJdbcTemplate {

	private JdbcTemplate jdbcTemplate;
	private EmpRowMapper empRowMapper = new EmpRowMapper();
	

	public Employee getEmployeeById(int id) {
		String sql = "select * from emp where id=?";
		Employee emp = jdbcTemplate.queryForObject(sql, empRowMapper,id);
		return emp;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> findAll(){
		String sql = "select * from emp";
		List<Employee> list = jdbcTemplate.query(sql, empRowMapper);
		return list;
	}
	
	public void addEmployee(Employee emp) {
		String sql="insert into emp(id,name,salary) values (?,?,?)";
		int x=jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getSalary());
		System.out.println(x+" row inserted");
		
	}
	
	class EmpRowMapper implements RowMapper<Employee>{

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee e= new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setSalary(rs.getDouble("salary"));
			return e;
		}
		
	}

}
