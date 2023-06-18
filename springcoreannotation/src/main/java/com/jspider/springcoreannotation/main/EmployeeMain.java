package com.jspider.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.bean.EmployeeBean;
import com.jspider.springcoreannotation.config.EmployeeConfig;

public class EmployeeMain {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		/* ! --By Using getBean(Class Type)---
		EmployeeBean emp1 = context.getBean(EmployeeBean.class);
		System.out.println(emp1);
		*/
		
		//! --By Using getBean(String Name)-----------
		EmployeeBean emp1 = (EmployeeBean) context.getBean("emp1");
		System.out.println(emp1);
		EmployeeBean emp2 = (EmployeeBean) context.getBean("emp2");
		System.out.println(emp2);
		((AnnotationConfigApplicationContext)context).close();
	}
}
