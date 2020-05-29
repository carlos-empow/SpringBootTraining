package com.springtraining.resttemplate.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springtraining.resttemplate.model.Employee;

@Service
public class EmployeeService {
		
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public List<Employee> getAllEmployees() {
		RestTemplate restTemplate = new RestTemplate();
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee[] employees = restTemplate.getForObject("http://localhost:8080/listEmployees", Employee[].class);
		employeeList = Arrays.asList(employees);
		return employeeList;

	}
	
	public ResponseEntity<Employee> add(Employee emp){
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForEntity("http://localhost:8080/add", emp, Employee.class);
	}
	
	public ResponseEntity<Employee> update(Employee emp){
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> params = new HashMap<String, String>();
		HttpEntity<Employee> requestEntity = new HttpEntity<Employee>(emp);
		return restTemplate.exchange("http://localhost:8080/update", HttpMethod.PUT, requestEntity, Employee.class, params);
	}
	
	public void delete(String empNo){
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> params = new HashMap<String, String>();
	    params.put("empNo", empNo );
		restTemplate.delete("http://localhost:8080/delete/{empNo}", params );
	}
	
}
