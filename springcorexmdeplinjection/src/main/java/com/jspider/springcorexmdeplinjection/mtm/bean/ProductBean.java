package com.jspider.springcorexmdeplinjection.mtm.bean;

import java.util.List;

import lombok.Data;

@Data
public class ProductBean {
	private int id;
	private String name;
	private String category;
	private long contact;
	List<CustomerBean>customers;
}
