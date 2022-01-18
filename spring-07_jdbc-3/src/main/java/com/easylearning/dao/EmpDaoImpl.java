package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easylearning.entity.Employee;

@Repository
public class EmpDaoImpl implements EmpDao{
	
	private static Connection connection;
	
	static {
		//Class.forName(null)
		
	}
	
	
	public Employee getEmployeeById(int id) {
		System.out.println("EmpDaoImpl.getEmployeeById");
		return null;
	}
	
	
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}



	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateSalary(int empId, double newSalary) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
