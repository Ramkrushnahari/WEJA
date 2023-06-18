package com.jspiders.builderdp.main;

import com.jspiders.builderdp.builder.ContactBuilder;
import com.jspiders.builderdp.object.Contact;

public class ContactMain {

	public static void main(String[] args) {
		Contact obj = new ContactBuilder().first_name("RAMKRUSHNHARI").middle_name("KAILAS").last_name("KENJALE").
				mobile_no(9168705338L).nickname("RAMBHAU").email("ram@gmail.com").gender("MALE").getContact();
		System.out.println(obj);
	}

}
