package com.jspider.Hibernate_2.manytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Entity
public class PassengerDTO {
	@Id
	private int id;
	private String Name;
	private int age;
	private int Seat_No;
	@ManyToOne
	private TrainDTO train;
}
