package com.jspider.springcorexmdeplinjection.mto.bean;

import lombok.Data;

@Data
public class PassengerBean {
	private int id;
	private String name;
	private int age;
	private TrainBean train;
}
