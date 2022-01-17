package com.easylearning.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.easylearning.dao.EmpDao;
import com.easylearning.entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Connection con=connection();
		System.out.println(con);
		EmpDao dao = new EmpDao();
		dao.setConnection(con);
		
		Employee emp = dao.getEmployeeById(1);
		System.out.println(emp);
	}
	
	public static Connection connection() {
		Connection conn=null;
		String drivername="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1522:xe";
		String username="hr";
		String password ="hr";
		
		try {
			Class.forName(drivername);
			conn= DriverManager.getConnection(url,username,password);
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
