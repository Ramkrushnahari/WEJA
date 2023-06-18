package com.jspider.springcorexmdeplinjection.bydir.oto.bean;
import lombok.Data;

@Data
public class DriverBean {
	private int id;
	private String name;
	private long contact ;
	private CarBean car;
}
