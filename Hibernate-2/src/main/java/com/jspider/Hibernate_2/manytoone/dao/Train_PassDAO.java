package com.jspider.Hibernate_2.manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernate_2.manytoone.dto.PassengerDTO;
import com.jspider.Hibernate_2.manytoone.dto.TrainDTO;

public class Train_PassDAO {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;

	private static void openConnection() {
		emf = Persistence.createEntityManagerFactory("COMP");
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
			TrainDTO train = new TrainDTO();
			train.setId(1);
			train.setTname("Koyna Express");
			train.setTNO(12345);
			em.persist(train);

			PassengerDTO passenger = new PassengerDTO();
			passenger.setId(1);
			passenger.setName("Suresh");
			passenger.setAge(25);
			passenger.setSeat_No(12);
			passenger.setTrain(train);
			em.persist(passenger);

			PassengerDTO passenger1 = new PassengerDTO();
			passenger1.setId(2);
			passenger1.setName("Ramesh");
			passenger1.setAge(30);
			passenger1.setSeat_No(14);
			passenger1.setTrain(train);
			em.persist(passenger1);
			et.commit();
		} finally {
			close();
		}
	}
}
