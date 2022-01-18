package com.easylearning.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.easylearning.entity.Employee;


@Repository
public class EmpDaoWithHibernateTemplate implements EmpDao{
	

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
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
