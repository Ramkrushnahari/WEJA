<%@page import="com.jspider.springmvc.pojo.EmployeePOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="NavBar.jsp" />
<%
String msg = (String) request.getAttribute("msg");
EmployeePOJO employee = (EmployeePOJO) request.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management</title>
</head>
<body bgcolor="aqua">

	<div align="center">
		<form action="./search" method="post">
			<fieldset>
				<legend>:::Search Employee:::</legend>
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
			</fieldset>
			<input type="submit" value="Search">
		</form>
		<%
		if (msg != null) {
		%>
		<h3>
			<%=msg%>
		</h3>
		<%
		}
		%>
		<%
		if (employee != null) {
		%>
		<table border="2px" solid style="background-color: pink;">
			<thead>
				<tr>
					<td>ID</td>
					<td>Name</td>
					<td>Email</td>
					<td>Contact</td>
					<td>Designation</td>
					<td>Salary</td>
				</tr>
			</thead>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getEmail()%></td>
				<td><%=employee.getContact()%></td>
				<td><%=employee.getDesignation()%></td>
				<td><%=employee.getSalary()%></td>
			</tr>
		</table>
		<%
		}
		%>
	</div>

</body>
</html>