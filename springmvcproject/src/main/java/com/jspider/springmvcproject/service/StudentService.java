package com.jspider.springmvcproject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springmvcproject.pojo.StudentPOJO;
import com.jspider.springmvcproject.repository.StudentRepository;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public StudentPOJO add(String name, String email, 
							long contact, String city) {
		StudentPOJO student = repository.add(name, email, contact, city);
		return student;
	}

	public StudentPOJO search(int id) {
		StudentPOJO student = repository.search(id);
		return student;
	}
	public List<StudentPOJO> searchAll() {
		List<StudentPOJO> students = repository.searchAll();
		return students;
	}

	public StudentPOJO remove(int id) {
		StudentPOJO student = repository.remove(id);
		return student;
	}

	public StudentPOJO update(int id, String name, String email, long contact, String city) {
		StudentPOJO student = repository.update(id, name, email, contact, city);
		return student;
	}
	
}