package com.cgr.demo.service;

import java.util.List;

import com.cgr.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee insert(Employee emp);
	Employee save(Employee emp);
	void deleteById(String empNo);
	
}
