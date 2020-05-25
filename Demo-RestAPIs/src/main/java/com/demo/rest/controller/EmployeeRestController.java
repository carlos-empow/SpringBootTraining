package com.demo.rest.controller;


import java.util.List;

import com.demo.rest.model.Employee;
import com.demo.rest.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "ListEmployees",method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

	@RequestMapping(value = "AddEmployee", method = RequestMethod.POST)
	public void AddEmployee(@RequestBody Employee emp) {
		employeeService.add(emp);
	}

	@RequestMapping(value = "UpdateEmployee", method = RequestMethod.PUT)
	public void UpdateEmployee(@RequestBody Employee emp) {
		employeeService.update(emp);
	}
	
	@RequestMapping(value = "DeleteEmployee/{empNo}", method = RequestMethod.DELETE)
	public void DeleteEmployee(@PathVariable("empNo") String empNo) {
		employeeService.delete(empNo);
	}

}