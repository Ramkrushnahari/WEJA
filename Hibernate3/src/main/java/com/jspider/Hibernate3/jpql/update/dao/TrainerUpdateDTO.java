package com.jspider.Hibernate3.jpql.update.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspider.Hibernate3.jpql.dto.insert.TrainerDTo;

public class TrainerUpdateDTO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTranstaction;
	private static Query query;
	private static String jpqlQuery;

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
			jpqlQuery = "update TrainerDTo set subject='Automation_Testing' where id =3";
			query = entityManager.createQuery(jpqlQuery);
			int n = query.executeUpdate();
			System.out.println(n);
			jpqlQuery = "From TrainerDTo";
			query = entityManager.createQuery(jpqlQuery);
			List<TrainerDTo> trainers = query.getResultList();
			for (TrainerDTo trainer : trainers) {
				System.out.println(trainer);
			}
			entityTranstaction.commit();
		} finally {
			closeConnection();
		}
	}
}
