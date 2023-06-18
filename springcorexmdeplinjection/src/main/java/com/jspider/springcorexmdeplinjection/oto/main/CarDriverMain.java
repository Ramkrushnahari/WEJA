package com.jspider.springcorexmdeplinjection.oto.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexmdeplinjection.bydir.oto.bean.DriverBean;
import com.jspider.springcorexmdeplinjection.oto.bean.CarBean;

public class CarDriverMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CarDriverConfig.xml");
		//CarBean car = context.getBean(CarBean.class);
		System.out.println("\n---uni Directional ---\n");
		
		CarBean car =(CarBean)context.getBean("car");
		System.out.println(car);
		
		System.out.println("\n---BY Directional ---\n");
		DriverBean driver1 = (DriverBean) context.getBean("driver");
		System.out.println(driver1);
		((ClassPathXmlApplicationContext) context).close();
	}
}
