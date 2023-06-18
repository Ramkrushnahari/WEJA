package com.jspider.jdbc1jdbctask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TaskJdbcTable {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filepath = "D:\\RKBackup\\WEJA1\\jdbc\\resource\\db_info.properties";
	private static int result;
	private static String insertQuery;

	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filepath);

			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverPath"));

			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			statement = connection.createStatement();
			insertQuery = "create table emp (empno int(2) primary key,ename varchar(20),job varchar(100),sal varchar(20))";

			result = statement.executeUpdate(insertQuery);

			System.out.println("Query ok" + result + "row(s) affected");
			System.out.println("======================================");

			insertQuery = "insert into emp values (1,'Ram','Devloper',35000)";

			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");
			insertQuery = "insert into emp values (2,'Akshay','Devloper',35000)";
			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");
			insertQuery = "insert into emp values (3,'akash','Devloper',35000)";

			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");
			insertQuery = "insert into emp values (4,'Abhishek','Devloper',35000)";

			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");
			insertQuery = "insert into emp values (5,'pavan','Devloper',35000)";

			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");
			System.out.println();

			insertQuery = "select * from emp";
			resultSet = statement.executeQuery(insertQuery);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || " + resultSet.getString(2) + " || "
						+ resultSet.getString(3) + "||" + resultSet.getString(4));

			}
			System.out.println("===============================");

			insertQuery = "update emp " + " set job = 'ProjectHead'" + "where empno = 3";
			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");

			insertQuery = "update emp " + " set sal = 50000 " + "where ename ='akash' ";
			result = statement.executeUpdate(insertQuery);
			System.out.println("UPDATE RECORD Query ok" + result + "row(s) affected");

			System.out.println("=====================================");

			insertQuery = "select * from emp";
			resultSet = statement.executeQuery(insertQuery);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || " + resultSet.getString(2) + " || "
						+ resultSet.getString(3) + "||" + resultSet.getString(4));

			}
			System.out.println("======================================");

			insertQuery = "delete from emp " + " where empno = 5 ";
			result = statement.executeUpdate(insertQuery);
			System.out.println("Query ok" + result + "row(s) affected");

			insertQuery = "delete from emp " + " where empno = 2 ";
			result = statement.executeUpdate(insertQuery);
			System.out.println("DELETED RECORD Query ok" + result + "row(s) affected");
			System.out.println();

			insertQuery = "select * from emp";
			resultSet = statement.executeQuery(insertQuery);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || " + resultSet.getString(2) + " || "
						+ resultSet.getString(3) + "||" + resultSet.getString(4));

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
