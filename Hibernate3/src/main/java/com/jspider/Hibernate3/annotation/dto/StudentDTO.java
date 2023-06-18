package com.jspider.Hibernate3.annotation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StudentDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Name")
	private String S_Name;
	@Column(name="City")
	private String S_City;
	@Column(name="percent")
	private double percentage;
	
}
