package com.jspider.Hibernate_2.bydimanytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity

public class ProductByDTO {
	@Id
	private int id;
	private String Name;
	private String Category;
	private Double Price;
	@ManyToMany(mappedBy = "products")
	private List<CustomerByDTO> customers;
}