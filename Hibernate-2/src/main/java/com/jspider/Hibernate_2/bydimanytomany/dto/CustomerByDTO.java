package com.jspider.Hibernate_2.bydimanytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class CustomerByDTO {
	@Id
	private int id;
	private String Name;
	private Long Contact;
	@ManyToMany
	private List<ProductByDTO> products;
	
}
