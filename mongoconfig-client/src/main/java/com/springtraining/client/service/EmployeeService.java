package com.springtraining.client.service;

import java.util.List;

import com.springtraining.client.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee insert(Employee emp);
	Employee save(Employee emp);
	void deleteById(String empNo);
	
}
