package com.jspider.Hibernate_2.onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AdharDTO {
	
	@Id
	private int id;
	private long Ano;
	private String date_of_issue;
}
