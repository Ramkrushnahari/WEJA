package com.jspider.Hibernate_2.onetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernate_2.onetomnay.dto.Company1Dto;
import com.jspider.Hibernate_2.onetomnay.dto.EmployeeMDTO;

public class CompanyInfoDAO {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;

	private static void openConnection() {
		emf = Persistence.createEntityManagerFactory("AADHAR");
		em = emf.createEntityManager();
		et = em.getTransaction();
	}

	private static void close() {
		if (emf != null) {
			emf.close();
		}
		if (em != null) {
			em.close();
		}
		if (et.isActive()) {
			et.rollback();
		}
	}

	public static void main(String[] args) {
		try {
			openConnection();
			et.begin();

			EmployeeMDTO emp = new EmployeeMDTO();
			emp.setId(1);
			emp.setName("Revan");
			emp.setCity("Pune");
			emp.setContact(1478523690L);
			em.persist(emp);
			EmployeeMDTO emp1 = new EmployeeMDTO();
			emp1.setId(2);
			emp1.setName("mangesh");
			emp1.setCity("PCMC");
			emp1.setContact(1478500090L);
			em.persist(emp1);
			
			List<EmployeeMDTO> emplyoees = Arrays.asList(emp,emp1);
			Company1Dto company = new Company1Dto();
			company.setId(1);
			company.setName("INFO WEB");
			company.setCity("Pune");
			company.setEmpl(emplyoees);
			em.persist(company);
			
			et.commit();
		} finally {
			close();
		}
	}
}
