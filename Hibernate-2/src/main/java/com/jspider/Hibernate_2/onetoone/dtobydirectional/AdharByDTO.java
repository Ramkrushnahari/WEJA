package com.jspider.Hibernate_2.onetoone.dtobydirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



import lombok.Data;

@Data
@Entity
public class AdharByDTO {
	@Id
	private int id;
	private long Ano;
	private String date_of_issue;
	@OneToOne
	private PersonByDTO person; 
}
