<%@page import="com.jspider.springmvc.pojo.EmployeePOJO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp" />
<%
EmployeePOJO employee = (EmployeePOJO) request.getAttribute("emp");
String msg = (String) request.getAttribute("msg");
List<EmployeePOJO> employees = (List<EmployeePOJO>) request.getAttribute("empList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management</title>
<style type="text/css">
fieldset {
	margin: 15px 520px;
}
</style>
</head>
<body>

	<div align="center">
		<%
		if (employee != null) {
		%>
		<form action="./updateData" method="post">
			<fieldset>
				<legend>:::Update Employee:::</legend>
				<table >
					<tr>
						<td>ID</td>
						<td><input type="text" name="id"
							value="<%=employee.getId()%>"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"
							value="<%=employee.getName()%>"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email"
							value="<%=employee.getEmail()%>"></td>
					</tr>
					<tr>
						<td>Contact</td>
						<td><input type="text" name="contact"
							value="<%=employee.getContact()%>"></td>
					</tr>
					<tr>
						<td>Designation</td>
						<td><input type="text" name="designation"
							value="<%=employee.getDesignation()%>"></td>
					</tr>
					<tr>
						<td>Salary</td>
						<td><input type="text" name="salary"
							value="<%=employee.getSalary()%>"></td>
					</tr>
				</table>
			</fieldset>
			<input type="submit" value="Update">
		</form>
		<%
		} else {
		%>
		<form action="./update" method="post">
			<fieldset>
				<legend>:::Select Employee:::</legend>
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
			</fieldset>
			<input type="submit" value="Select"></br>
		</form>
		<%
		if (msg != null) {
		%>
		<h3><%=msg%>
		</h3>
		<%
		}
		%>
		<%
		if (employees != null) {
		%>
		</br>
		<table  border="2px" solid>
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
			<%
			for (EmployeePOJO pojo : employees) {
			%>
			<tr>
				<td><%=pojo.getId()%></td>
				<td><%=pojo.getName()%></td>
				<td><%=pojo.getEmail()%></td>
				<td><%=pojo.getContact()%></td>
				<td><%=pojo.getDesignation()%></td>
				<td><%=pojo.getSalary()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		%>

		<%
		}
		%>
	</div>

</body>
</html>