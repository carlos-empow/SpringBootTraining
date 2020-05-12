package com.cgr.demo.controller;


import java.util.List;

import com.cgr.demo.dao.EmployeeDAO;
import com.cgr.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Demo.";
	}

	@RequestMapping(value = "/employees",
			method = RequestMethod.GET,
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDAO.getAllEmployees();
		return list;
	}

	@RequestMapping(value = "/employee/{empNo}",
			method = RequestMethod.GET,
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Employee getEmployee(@PathVariable("empNo") String empNo) {
		return employeeDAO.getEmployee(empNo);
	}
	
	@RequestMapping(value = "/employee",
			method = RequestMethod.PUT,
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeDAO.updateEmployee(emp);
	}
	
	@RequestMapping(value = "/employee/{empNo}",
			method = RequestMethod.DELETE,
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteEmployee(@PathVariable("empNo") String empNo) {
		employeeDAO.deleteEmployee(empNo);
	}

}