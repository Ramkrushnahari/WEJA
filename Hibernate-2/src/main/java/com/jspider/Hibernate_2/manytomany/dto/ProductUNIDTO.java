package com.jspider.Hibernate_2.manytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity

public class ProductUNIDTO {
	@Id
	private int id;
	private String Name;
	private String Category;
	private Double Price;
	@ManyToMany
	private List<CustomerUniDTO> customers;
}