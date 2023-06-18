package com.jspider.Hibernate3.jpql.display.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspider.Hibernate3.jpql.dto.insert.TrainerDTo;

public class TrainerCRUDDTO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTranstaction;
	private static Query query;
	private static String jpqlQuery;
	private static int n;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("Anotation");
		entityManager = entityManagerFactory.createEntityManager();
		entityTranstaction = entityManager.getTransaction();

	}

	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTranstaction.isActive()) {
			entityTranstaction.rollback();
		}

	}

	public static void main(String[] args) {
		try {
			openConnection();
			entityTranstaction.begin();
			//Insert
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many record to be inserted in table ");
			int n = sc.nextInt();
			TrainerDTo trainer = new TrainerDTo();

			for(int i=1;i<=n;i++) {
				System.out.println("Enter the Name: ");
				trainer.setName(sc.next());
				System.out.println("Enter Subject :");
				trainer.setSubject(sc.next());
				entityManager.persist(trainer);
			}
			
		//Update	
			System.out.println("Which trainer U want to update");
			int id =sc.nextInt();
			jpqlQuery = "update TrainerDTo set subject='Automation_Testing' where id ="+id;
			query = entityManager.createQuery(jpqlQuery);
			
			n = query.executeUpdate();
			System.out.println(n);
			
			jpqlQuery = "From TrainerDTo";
			query = entityManager.createQuery(jpqlQuery);
			List<TrainerDTo> trainers = query.getResultList();
			for (TrainerDTo trainer1 : trainers) {
				System.out.println(trainer1);
			}
			
			jpqlQuery = "delete from TrainerDTo where id =6";
			query = entityManager.createQuery(jpqlQuery);
			n = query.executeUpdate();
			System.out.println(n);
			
			jpqlQuery = "From TrainerDTo";
			query = entityManager.createQuery(jpqlQuery);
			List<TrainerDTo> trainerd = query.getResultList();
			for (TrainerDTo trainer1 : trainerd) {
				System.out.println(trainer1);
			}
			
			sc.close();
			entityTranstaction.commit();
		} finally {
			closeConnection();
		}
	}
}
