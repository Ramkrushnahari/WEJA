package com.jspider.springcorexmdeplinjection.oto.bean;

import lombok.Data;

@Data
public class CarBean {
	private int id;
	private String brand;
	private String model;
	private String regno;
	private DriverBean driver;
}
