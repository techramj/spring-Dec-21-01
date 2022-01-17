package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.easylearning.entity.Employee;

public class EmpDao {
	
	private Connection connection;
	
	
	public Employee getEmployeeById(int id) {
		String sql="select * from emp where id=?";
		Employee emp;
		PreparedStatement ps=null;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setSalary(rs.getDouble(3));
				emp.setName(rs.getString(2));
				return emp;
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
