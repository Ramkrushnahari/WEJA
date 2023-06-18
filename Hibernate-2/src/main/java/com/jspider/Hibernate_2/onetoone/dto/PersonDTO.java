package com.jspider.Hibernate_2.onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class PersonDTO {
	@Id
	private int id;
	private String Name;
	private String city;
	private long contact;
	@OneToOne
	private AdharDTO aadhar;
}
