package com.easylearning.dao;

import java.util.List;

import com.easylearning.entity.Employee;

public interface EmpDao {
	public Employee getEmployeeById(int id);

	public List<Employee> findAll();

	public void addEmployee(Employee emp);

	public void updateSalary(int empId, double newSalary);
	
	public void deleteEmployee(int id);
	
	
}
