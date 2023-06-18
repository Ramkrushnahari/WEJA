package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.beans.EmployeeBean;

public class EmployeeMain {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			/*
			 *--- By Using getBean(CLASS TYPE)--
			 	ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
				EmployeeBean emp1 = context.getBean(EmployeeBean.class);
				System.out.println(emp1);			
				((ClassPathXmlApplicationContext)context).close();
			*/
			
			//---By Using getBean(String beanName)---
			
			ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
			EmployeeBean emp1 = (EmployeeBean) context.getBean("emp1");//Upcasting Done
			System.out.println(emp1);
			EmployeeBean emp2 = (EmployeeBean) context.getBean("emp2");
			System.out.println(emp2);
			((ClassPathXmlApplicationContext)context).close();
			
		}

}
