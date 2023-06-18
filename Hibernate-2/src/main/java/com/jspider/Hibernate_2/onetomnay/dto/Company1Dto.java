package com.jspider.Hibernate_2.onetomnay.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Company1Dto {
	@Id
	private int id;
	private String Name;
	private String City;
	@OneToMany
	private List<EmployeeMDTO> empl;
}
