package com.jspiders.builderdp.object;

public class Contact {
	String first_name;
	String middle_name;
	String last_name;
	String nickname;
	String email;
	long mobile_no;
	long landline_no;
	String dob;
	String company;
	String address;
	String gender;
	public Contact(String first_name, String middle_name, String last_name, String nickname, String email,
			long mobile_no, long landline_no, String dob, String company, String address, String gender) {
		
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.nickname = nickname;
		this.email = email;
		this.mobile_no = mobile_no;
		this.landline_no = landline_no;
		this.dob = dob;
		this.company = company;
		this.address = address;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Contact : \n First-Name: "+ first_name +"\n Middle-Name: "+ middle_name +"\n Last-Name: "+ last_name +"\n Nickname: "+ nickname 
				+"\n E-Mail: "+ email +"\n Mobile-No : "+ mobile_no +"\n Landline-No : "+ landline_no +"\n DOB :"+ dob +"\n Company :"+ company
				+"\n Adress :"+ address +"\n Gender : "+ gender ;
		
	}
	
}
