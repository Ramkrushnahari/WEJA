package com.jspider.Hibernate_2.manytomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernate_2.manytomany.dto.CustomerUniDTO;
import com.jspider.Hibernate_2.manytomany.dto.ProductUNIDTO;



public class CusProdDAO {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	private static void open() {
		emf=Persistence.createEntityManagerFactory("COMP");
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
			
			CustomerUniDTO cust1 = new CustomerUniDTO();
			cust1.setId(1);
			cust1.setName("RK");
			cust1.setContact(1234567890L);
			em.persist(cust1);
		
			CustomerUniDTO cust2 = new CustomerUniDTO();
			cust2.setId(2);
			cust2.setName("MK");
			cust2.setContact(1004567890L);
			em.persist(cust2);
		
			CustomerUniDTO cust3 = new CustomerUniDTO();
			cust3.setId(3);
			cust3.setName("sd");
			cust3.setContact(1200067890L);
			em.persist(cust3);
			
			List<CustomerUniDTO> customer1 = Arrays.asList(cust1,cust2);
			
			ProductUNIDTO prod1 = new ProductUNIDTO();
			prod1.setId(1);
			prod1.setName("AA");
			prod1.setCategory("XXX");
			prod1.setPrice(123.5);
			prod1.setCustomers(customer1);
			em.persist(prod1);
			
			List<CustomerUniDTO> customers2 = Arrays.asList(cust2, cust3);
			ProductUNIDTO prod2 = new ProductUNIDTO();
			prod2.setId(2);
			prod2.setName("Mobile");
			prod2.setCategory("Electronics");
			prod2.setPrice(22000.0);
			
			prod2.setCustomers(customers2);
			em.persist(prod2);
			
			List<CustomerUniDTO> customers3 = Arrays.asList(cust1, cust3);
			ProductUNIDTO prod3 = new ProductUNIDTO();
			prod3.setId(3);
			prod3.setName("Tshirt");
			prod3.setCategory("Cloths");
			prod3.setPrice(550.0);
			
			prod3.setCustomers(customers3);
			em.persist(prod3);
			
			et.commit();
		} finally {
			close();
		}
	}
}
