package com.jspider.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspider.springcoreannotation.bean.EmployeeBean;

public class EmployeeConfig {
	
	@Bean("emp1")
	public EmployeeBean getEmployee1() {
		EmployeeBean emp1 = new EmployeeBean();
		emp1.setId(1);
		emp1.setName("Gopal");
		emp1.setEmail("Gopal@gmail.com");
		return emp1;
	}
	@Bean("emp2")
	public EmployeeBean getEmployee2() {
		EmployeeBean emp2 = new EmployeeBean();
		emp2.setId(2);
		emp2.setName("Shilpa");
		emp2.setEmail("Shilpa@gmail.com");
		return emp2;
		
	}
}
