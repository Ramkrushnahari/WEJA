<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String Id = request.getParameter("id");
String Ename = request.getParameter("Ename");
String Job = request.getParameter("Job");
String Sal = request.getParameter("sal");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Database connection</title>
</head>
<body>
	<div align="center">
		<form action="./EmployeeRegistration.jsp" method="post">
			<fieldset>
				<legend style="align-content:center;">Employee
					Registration</legend>
				<table>
					<tr>
						<th>EMPNO</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>Ename</th>
						<td><input type="text" name="Ename"></td>
					</tr>
					<tr>
						<th>Job</th>
						<td><input type="text" name="Job"></td>
					</tr>
					<tr>
						<th>Salary</th>
						<td><input type="text" name="sal"></td>
					</tr>
				</table>
			</fieldset>
			<input style="margin-top: 2px;" type="submit" value="Submit">
		</form>
	</div>

	<%!Connection conn;
	PreparedStatement preparedStatement;
	int result;
	String dburl = "jdbc:mysql://localhost:3306/weja1";
	String user = "root";
	String password = "root";
	String query;%>
	<%
	if (Id != null && Ename != null && Job != null && Sal != null) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dburl, user, password);
		query = "insert into emp values(?,?,?,?)";
		preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, Id);
		preparedStatement.setString(2, Ename);
		preparedStatement.setString(3, Job);
		preparedStatement.setString(4, Sal);
		result = preparedStatement.executeUpdate();
	}
	%>
	<%
	if (result != 0) {
	%>
	<h3 align="center">
	<%=result%>
	Row inserted in DataBase...!!!</h3>
	<%
	}
	%>


</body>
</html>