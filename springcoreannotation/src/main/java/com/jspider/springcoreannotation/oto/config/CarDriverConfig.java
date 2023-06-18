package com.jspider.springcoreannotation.oto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspider.springcoreannotation.oto.beans.CarBean;

@ComponentScan(basePackages = "com.jspider.springcoreannotation")
public class CarDriverConfig {
	@Bean("car1")
	public CarBean getCar() {
		return new CarBean();
	}
	
}
