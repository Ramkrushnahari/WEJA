package com.jspider.springcoreannotation.oto.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.oto.beans.CarBean;
import com.jspider.springcoreannotation.oto.config.CarDriverConfig;


public class CarDriverMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarDriverConfig.class);
		CarBean car1 = (CarBean) context.getBean("car1");
		System.out.println(car1);
		((AnnotationConfigApplicationContext)context).close();
	}
	
}
