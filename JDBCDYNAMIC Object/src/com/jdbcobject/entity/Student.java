package com.jdbcobject.entity;

public class Student {
	private int id;
	private String Name;
	private long contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	} 
	@Override
	public String toString() {
		return "student[id= "+id+", Name= "+Name+",contact= "+contact+" ]";
	}
}
