package com.jspider.jdbc1.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcSelectDemo2 {
	public static void main(String[] args) {
		try {
			// STEP 1: LOAD THE DRIVER CLASS.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// STEP 2 - OPEN CONNECTIONS

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja1", "root", "root");

			// STEP 3 - CREATE/PREPARE STATEMENT.
			Statement stt = conn.createStatement();

			// STEP 4 - PROCESS THE RESULT.
			ResultSet result = stt.executeQuery("select * from student");
			// System.out.println(result);
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3));
			}
			// STEP 5 - close connections.
			conn.close();
			stt.close();
			result.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
