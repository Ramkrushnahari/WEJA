package com.jspider.Hibernate3.jpql.dto.insert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TrainerDTo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private String Subject;
}
