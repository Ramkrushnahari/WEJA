package com.jspider.Hibernate_2.bymanytomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernate_2.bydimanytomany.dto.CustomerByDTO;
import com.jspider.Hibernate_2.bydimanytomany.dto.ProductByDTO;

public class CusProdByDAO {
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
			
			CustomerByDTO cust1 = new CustomerByDTO();
			cust1.setId(1);
			cust1.setName("RK");
			cust1.setContact(1234567890L);
			
			CustomerByDTO cust2 = new CustomerByDTO();
			cust2.setId(2);
			cust2.setName("MK");
			cust2.setContact(1004567890L);
			
		
			CustomerByDTO cust3 = new CustomerByDTO();
			cust3.setId(3);
			cust3.setName("sd");
			cust3.setContact(1200067890L);
			
			
			ProductByDTO prod1 = new ProductByDTO();
			prod1.setId(1);
			prod1.setName("AA");
			prod1.setCategory("XXX");
			prod1.setPrice(123.5);
			
			ProductByDTO prod2 = new ProductByDTO();
			prod2.setId(2);
			prod2.setName("Mobile");
			prod2.setCategory("Electronics");
			prod2.setPrice(22000.0);
			
			ProductByDTO prod3 = new ProductByDTO();
			prod3.setId(3);
			prod3.setName("Tshirt");
			prod3.setCategory("Cloths");
			prod3.setPrice(550.0);
			
			List<CustomerByDTO> customer1 = Arrays.asList(cust1,cust2);
			prod1.setCustomers(customer1);
			em.persist(prod1);
			
			List<CustomerByDTO> customers2 = Arrays.asList(cust2, cust3);
			prod2.setCustomers(customers2);
			em.persist(prod2);
			
			List<CustomerByDTO> customers3 = Arrays.asList(cust1, cust3);
			prod3.setCustomers(customers3);
			em.persist(prod3);
			
			List<ProductByDTO> product1=Arrays.asList(prod1,prod2);
			cust1.setProducts(product1);
			em.persist(cust1);

			List<ProductByDTO> product2=Arrays.asList(prod2,prod3);
			cust1.setProducts(product2);
			em.persist(cust2);
			
			List<ProductByDTO> product3=Arrays.asList(prod1,prod3);
			cust1.setProducts(product3);
			em.persist(cust3);
			
			
			et.commit();
		} finally {
			close();
		}
	}
}
