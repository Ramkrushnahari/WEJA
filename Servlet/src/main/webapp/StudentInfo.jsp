<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String Add = request.getParameter("Add");
String contact = request.getParameter("contact");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend style="margin: auto;"><b>Student Details...</b></legend>
			<table>
				<tr>
					<th>Name :</th>
					<td><%=name%></td>
				</tr>
				<tr>
					<th>Email :</th>
					<td><%=email%></td>
				</tr>
				<tr>
					<th>Address :</th>
					<td><%=Add%></td>
				</tr>
				<tr>
					<th>Contact :</th>
					<td><%=contact%></td>
				</tr>
			</table>

		</fieldset>
	</div>
</body>
</html>