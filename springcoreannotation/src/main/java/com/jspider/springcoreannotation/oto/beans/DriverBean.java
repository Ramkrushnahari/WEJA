package com.jspider.springcoreannotation.oto.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DriverBean {
	@Value("1")
	private int id;
	@Value("RamHari")
	private String name;
	@Value("123456789")
	private long contact ;
	//private CarBean car;
}