package com.jspider.Hibernate_2.onetomnay.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EmployeeMDTO {
	@Id
	private int id;
	private String name;
	private String city;
	private Long contact;
	
}
