package com.jspider.Hibernet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class EmployeeDto {
	@Id
	private int id;
	private String Name;
	private String Email;
	private long Contact; 
}
