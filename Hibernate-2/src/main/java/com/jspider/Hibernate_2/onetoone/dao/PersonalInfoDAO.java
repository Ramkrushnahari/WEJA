package com.jspider.Hibernate_2.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernate_2.onetoone.dto.AdharDTO;
import com.jspider.Hibernate_2.onetoone.dto.PersonDTO;

public class PersonalInfoDAO {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	private static void openConnection() {
		emf = Persistence.createEntityManagerFactory("AADHAR");
		em = emf.createEntityManager();
		et = em.getTransaction();
	}
	private static void close() {
		if(emf!=null) {
			emf.close();
		}
		if(em!=null) {
			em.close();
		}
		if(et.isActive()) {
			et.rollback();
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			et.begin();
			AdharDTO adhar = new AdharDTO();
			adhar.setId(1);
			adhar.setAno(12345678902L);
			adhar.setDate_of_issue("12-jan-2019");
			em.persist(adhar);
			
			PersonDTO person = new PersonDTO();
			person.setId(1);
			person.setName("Rambhau");
			person.setCity("DHARAMPURI");
			person.setContact(1234567890L);
			person.setAadhar(adhar);
			em.persist(person);
			et.commit();
			
		}finally {
			close();
		}
	}
}
