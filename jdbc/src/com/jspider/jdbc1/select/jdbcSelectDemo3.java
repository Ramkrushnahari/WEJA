package com.jspider.jdbc1.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcSelectDemo3 {
	private static Connection conn;
	private static Statement stt ;
	private static ResultSet resultset;
	public static void main(String[] args) {
		try {
			//Step 1 - Load Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2 - Open Connections.
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
			//Step 3 - Create the Statement.
			stt = conn.createStatement();
			resultset = stt.executeQuery("select * from actor");
			//Step 4 - Process the result.
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" | | "+resultset.getString(2)+ " | | "+resultset.getString(3)+" | | "+resultset.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stt!=null) {
					stt.close();
				}
				if(resultset!=null) {
					resultset.close();
				}
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
			
	}

}
