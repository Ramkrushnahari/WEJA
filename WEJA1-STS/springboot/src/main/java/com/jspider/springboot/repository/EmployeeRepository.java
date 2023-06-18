package com.jspider.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.springboot.pojo.EmployeePOJO;

public interface EmployeeRepository extends JpaRepository<EmployeePOJO, Integer> {

}
