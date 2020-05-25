package com.cgr.demo.controller;


import java.util.List;

import com.cgr.demo.model.Employee;
import com.cgr.demo.service.EmployeeService;

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
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Demo.";
	}
	
	@RequestMapping(value= "listEmployees", method=RequestMethod.GET)
	public List<Employee> listEmployees(){
		return employeeService.findAll();
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public Employee add(@RequestBody Employee emp) {
		return employeeService.insert(emp);
	}
	
	@RequestMapping(value= "update", method=RequestMethod.PUT)
	public Employee update(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	@RequestMapping(value= "delete/{empNo}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("empNo") String empNo) {
		employeeService.deleteById(empNo);
    }

}