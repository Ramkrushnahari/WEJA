package com.jspider.springcorexmdeplinjection.otm.bean;

import java.util.List;

import lombok.Data;

@Data
public class TeamBean {
	private int id;
	private String name;
	private String city;
	List<PlayerBean>players;
}
