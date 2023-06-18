package com.jspider.serializationdeserialization.object;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 42L;
	int id;
	String name;
	String email;
	
	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		
		return "USER[ ID : "+id+" Name : "+name+" Email Id : "+email +" ]";
	}
}
