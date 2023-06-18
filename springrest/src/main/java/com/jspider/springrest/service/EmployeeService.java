package com.jspider.springrest.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springrest.pojo.EmployeePOJO;
import com.jspider.springrest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	public EmployeePOJO addEmployee(EmployeePOJO employee) {
		EmployeePOJO pojo = repository.addEmployee(employee);
		return pojo;
	}

	public EmployeePOJO searchEmployee(int id) {
		EmployeePOJO pojo = repository.searchEmployee(id);
		return pojo;
	}

}