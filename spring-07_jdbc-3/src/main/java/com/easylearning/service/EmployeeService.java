package com.easylearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.easylearning.dao.EmpDao;
import com.easylearning.dao.EmpDaoWithJdbcTemplate;
import com.easylearning.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	@Qualifier(value = "empDaoWithJdbcSupport")
	private EmpDao empDao;
	
	private EmpDaoWithJdbcTemplate dao;
	
	public List<Employee> getAllEmployees(){
		return empDao.findAll();
	}
	
	public Employee getEmployeeDetail(int id) {
		return empDao.getEmployeeById(id);
	}
	
}
