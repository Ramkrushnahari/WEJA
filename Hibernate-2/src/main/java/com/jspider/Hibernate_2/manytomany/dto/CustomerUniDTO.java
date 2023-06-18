package com.jspider.Hibernate_2.manytomany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustomerUniDTO {
	@Id
	private int id;
	private String Name;
	private Long Contact;
}
