package com.jspider.springcorexmdeplinjection.mtm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexmdeplinjection.bydirc.mtm.bean.CustomerBean;
import com.jspider.springcorexmdeplinjection.mtm.bean.ProductBean;

public class CustProdMain {
	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("CustProdConfig.xml");
		ProductBean product1 = (ProductBean) context.getBean("product1");
		ProductBean product2 = (ProductBean) context.getBean("product2");
		//Print bean object for UniDirection
		System.out.println("-----UniDirectional------");
		System.out.println("\n"+product1);
		System.out.println(product2+"\n");
		
		System.out.println("-----ByDirectional------");
		CustomerBean cust1 = (CustomerBean) context.getBean("customer1");
		CustomerBean cust2 = (CustomerBean) context.getBean("customer2");
		//Print bean object for ByiDirection
		System.out.println("\n"+cust1);
		System.out.println(cust2);
		((ClassPathXmlApplicationContext)context).close();
	}
}
