package com.jspider.Hibernet.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Hibernet.dto.StudentDTO;

public class StudentDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTranstaction;
	private static Scanner s=new Scanner(System.in);
	private static StudentDTO student=new StudentDTO();
	
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
			
			System.out.println("How many data you want to create");
			int size=s.nextInt();
			
			for(int i=1;i<=size;i++) {
				//StudentDTO student=new StudentDTO();
				System.out.println("Enter id");
				int id=s.nextInt();
				student.setId(id);
				System.out.println("Enter name");
				String name=s.next();
				student.setName(name);
				System.out.println("Enter email");
				s.nextLine();
				String email=s.nextLine();
				student.setEmail(email);
				System.out.println("Enter number");
				long contact=s.nextLong();
				student.setContact(contact);
				
				entityManager.persist(student);
			}
			student=entityManager.find(StudentDTO.class,1);
			System.out.println(student);
			student=entityManager.find(StudentDTO.class,2);
			System.out.println(student);
			
			student=entityManager.find(StudentDTO.class,3);
			System.out.println(student);
			student=entityManager.find(StudentDTO.class,4);
			System.out.println(student);
			student=entityManager.find(StudentDTO.class,5);
			System.out.println(student);
			//Update
			student=entityManager.find(StudentDTO.class,4);
			student.setName("Bhush");
			entityManager.persist(student);
			//Delete
			student=entityManager.find(StudentDTO.class,5);
			entityManager.remove(student);
			
			
			entityTranstaction.commit();
			
		
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			closeConnection();
		}
	}

}
