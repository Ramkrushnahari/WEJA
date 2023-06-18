<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
	background-image: url(./SL-123119-26540-43.jpg);
	background-size: cover;
	color: black;
	font-family: sans-serif;
	font-size: 25px;
}
</style>
<body>
	<div align="center">
		<center>
			<h1>SONG LIST</h1>
		</center>
	
		<table border=1px solid>
			<tr>
				<td>ID</td>
				<td>SONG NAME</td>
				<td>SINGER NAME</td>

			</tr>
		</table>
		<%
		try {
			response.setContentType("text/html");

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja1?user=root&password=root");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from multiplayer1 ");

			ResultSet resultSet = preparedStatement.executeQuery();
		%>
		<%
		while (resultSet.next()) {
		%>
		<table border="3px" solid>
			<tr>
				<td>
					<%
					out.println(resultSet.getInt(1));
					%>
				</td>
				<td>
					<%
					out.println(resultSet.getString(2));
					%>
				</td>
				<td>
					<%
					out.println(resultSet.getString(3));
					%>
				</td>

			</tr>
		</table>

		<%
		}

		} catch (Exception e) {
		e.printStackTrace();

		}
		%>
	</div>
</body>
</html>