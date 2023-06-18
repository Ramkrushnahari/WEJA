package com.jspider.springmvcproject.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springmvcproject.pojo.AdminPOJO;
import com.jspider.springmvcproject.repository.AdminRepository;



@Service
public class AdminService {

	@Autowired
	private AdminRepository repository;

	public AdminPOJO login(String username, String password) {
		AdminPOJO admin = repository.login(username, password);
		return admin;
	}

	public AdminPOJO addAdmin(String username, String password) {
		AdminPOJO admin = repository.addAdmin(username, password);
		return admin;
	}

}