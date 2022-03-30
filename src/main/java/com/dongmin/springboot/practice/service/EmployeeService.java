package com.dongmin.springboot.practice.service;

import java.util.List;

import com.dongmin.springboot.practice.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
