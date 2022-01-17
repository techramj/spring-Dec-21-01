package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easylearning.entity.Employee;

@Repository
public class EmpDaoWithDaoSource {

	@Autowired
	private DataSource dataSource;

	public Employee getEmployeeById(int id) {
		
		Connection connection=null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		String sql = "select * from emp where id=?";
		Employee emp;
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setSalary(rs.getDouble(3));
				emp.setName(rs.getString(2));
				return emp;
			}

		} catch (SQLException e) {
			System.out.println(e.getClass());
		} finally {
			if (ps != null) {
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

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
