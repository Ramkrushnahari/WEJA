package com.jspider.jdbc1.select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
	private static String DriverPath = "com.mysql.cj.jdbc.Driver";
	private static String dburl = "jdbc:mysql://localhost:3306/weja1";
	private static String username = "root";
	private static String password = "root";
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;

	public static void main(String[] args) {

		try {
			// 1. Load Driver Class

			Class.forName(DriverPath);

			// 2. Open Connection
			
			con = DriverManager.getConnection(dburl, username, password);

			// 3. create Statement
			
			stmt = con.createStatement();

			// 4. Process the Result
			
			String query = "Select * from Student";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("ID is " + rs.getString(1) + "| " + rs.getString(2) + "| " + rs.getString(3) + "|");
			}
		
			// 5. Close Connection
			
		}catch (ClassNotFoundException e) {
		e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs !=null) {
					rs.close();
				}
			}catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
	}
}