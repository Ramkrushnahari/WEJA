package com.jspider.Hibernate_2.manytoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TrainDTO {
	@Id
	private int id;
	private String Tname;
	private int TNO;
}
