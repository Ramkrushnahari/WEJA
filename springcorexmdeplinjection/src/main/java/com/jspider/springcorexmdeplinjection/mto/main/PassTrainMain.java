package com.jspider.springcorexmdeplinjection.mto.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexmdeplinjection.mto.bean.PassengerBean;

public class PassTrainMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PassTrainConfig.xml");
		
		PassengerBean passenger1 = (PassengerBean) context.getBean("passenger1");
		
		PassengerBean passenger2 = (PassengerBean) context.getBean("passenger2");
		System.out.println(passenger1);
		System.err.println(passenger2);
		((ClassPathXmlApplicationContext)context).close();
	}
}
