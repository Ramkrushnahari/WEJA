package com.jspider.Hibernate3.annotation.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.jspider.Hibernate3.annotation.dto.StudentDTO;

public class StudentDAO {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	private static void open() {
		emf=Persistence.createEntityManagerFactory("Anotation");
		em=emf.createEntityManager();
		et=em.getTransaction();
		
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
			open();
			et.begin();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many record to be inserted in table");
			int n = sc.nextInt();
			StudentDTO student = new StudentDTO();
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter the Name of student :");
				student.setS_Name(sc.next());
				System.out.println("Enter the City of student :");
				student.setS_City(sc.next());
				System.out.println("Enter the Percentage of student :");
				student.setPercentage(sc.nextDouble());
				
			}
			em.persist(student);
			sc.close();
			et.commit();
		} finally {
			close();
			
		}
	}
}
