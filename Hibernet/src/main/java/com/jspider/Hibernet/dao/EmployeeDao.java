package com.jspider.Hibernet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernet.dto.EmployeeDto;

public class EmployeeDao {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTranstaction;
	
	private static void openConnection() {
		entityManagerFactory =Persistence.createEntityManagerFactory("emp");
		entityManager =entityManagerFactory.createEntityManager();
		entityTranstaction = entityManager.getTransaction();
		
	}
	private static void closeConnection() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		if(entityManager!=null) {
			entityManager.close();
		}
		if(entityTranstaction.isActive()) {
			entityTranstaction.rollback();
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			entityTranstaction.begin();
			EmployeeDto emp1 = new EmployeeDto();
			
			emp1.setId(11);
			emp1.setName("Ram");
			emp1.setEmail("ram@gmail.com");
			emp1.setContact(123456789L);
			entityManager.persist(emp1);
			entityTranstaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
}
