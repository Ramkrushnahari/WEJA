package com.jspider.springcoreannotation.oto.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;



@Data
public class CarBean {
	@Value("1")
	private int id;
	@Value("Mahindra")
	private String brand;
	@Value("Thar")
	private String model;
	@Value("MH-12-H-1212")
	private String regno;
	@Autowired
	private DriverBean driver;
}
