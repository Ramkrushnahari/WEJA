package com.jspider.MutiplayerHibernet.dao;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspider.MutiplayerHibernet.dto.SongDTO;

public class SongOperationDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Scanner scanner = new Scanner(System.in);
	private static SongDTO song = new SongDTO();
	private static Query query;
	private static String jpqlQuery;

	// Open connection method
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("MusicPlayer");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

	}

	// Close connection method
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}

	}

	// Chose song to play
	public void choseToPlaySong() {
		System.out.println("Playing song...please wait");
		System.out.println("loading song list....");
		try {
			openConnection();
			transaction.begin();
			jpqlQuery = "From SongDTO";
			query = manager.createQuery(jpqlQuery);
			List<SongDTO> songs = query.getResultList();

			for (SongDTO song : songs) {
				System.out.println(song);
				System.out.println();
			}

			System.out.println("Enter song ID to play song");
			int id = scanner.nextInt();
			song = manager.find(SongDTO.class, id);
			if (song == null) {
				System.out.println("Enter song ID is not present");
			} else {
				System.out.println(song);
			}

			transaction.commit();

		} finally {
			// TODO: handle finally clause
		}

	}

	// Playing all song
	public void playAllSong() {
		try {
			openConnection();
			transaction.begin();
			jpqlQuery = "From SongDTO";
			query = manager.createQuery(jpqlQuery);
			List<SongDTO> songs = query.getResultList();
			if (songs.size()==0) {
				System.out.println();
				System.out.println("No song present in the list");
			}
			
			for (SongDTO song : songs) {
				System.out.println(song);
				System.out.println();
				Thread.sleep(1500);
			}
			transaction.commit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeConnection();
		}
		


	}

	// Adding song
	public void addSong() {
		System.out.println("Adding song in list");
		try {
			openConnection();
			transaction.begin();
			

			System.out.println("Enter song id");
			int id = scanner.nextInt();
			song.setId(id);
			System.out.println("Enter Song name");
			scanner.nextLine();
			String songName = scanner.nextLine();
			song.setSongName(songName);
			System.out.println("Enter Singer name");
			String singerName = scanner.nextLine();
			song.setSingerName(singerName);
			System.out.println("Enter Move Name");
			String move = scanner.nextLine();
			song.setMoveName(move);
			System.out.println("Enter duration");
			double duration = scanner.nextDouble();
			song.setDuration(duration);

			manager.persist(song);
			
			transaction.commit();

		} finally {
			
		}

	}

	// Removing Song
	public void removeSong() {
		System.out.println("Removing song from list");

		try {
			openConnection();
			transaction.begin();
			System.out.println("Enter song id to remove");
			int id = scanner.nextInt();
			song = manager.find(SongDTO.class, id);
			
			if (song==null) {
				System.out.println();
				System.out.println("Enter song ID is not persent ");
			}else {
				manager.remove(song);
				System.out.println();
				System.out.println("Song remove successfully...");
			}
			
			

			transaction.commit();
		} finally {
			closeConnection();
		}

	}

	// Updating song
	public void updateSong() {
		try {
			openConnection();
			transaction.begin();
			
			
				System.out.println("Enter song ID to update song");
				int id=scanner.nextInt();
				song=manager.find(SongDTO.class,id);
			
			System.out.println("Enter updated song name");
			scanner.nextLine();
			String songName=scanner.nextLine();
			song.setSongName(songName);
			System.out.println("Enter updated Singer Name");
			String singerName=scanner.nextLine();
			song.setSingerName(singerName);
			System.out.println("Enter updated Movie Name");
			String movieName=scanner.nextLine();
			song.setMoveName(movieName);
			System.out.println("Enter updated duration of song");
			double duration=scanner.nextDouble();
			song.setDuration(duration);
			
			manager.persist(song);
			System.out.println("Song updated Successfully");
			
			transaction.commit();
			
		}
		catch (InputMismatchException e) {
			System.err.println("Please Provide valid Id");
		}finally {
			closeConnection();
		}

	}

}
