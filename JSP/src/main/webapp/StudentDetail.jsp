<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String contact = request.getParameter("contact");
String city = request.getParameter("city");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT DETAILS PAGE</title>
</head>
<body>
	<div style="margin: 0 auto;">
		<fieldset>
			<legend>STUDENT DETAIL</legend>

			<table>
				<tr>
					<td>NAME:</td>
					<td><%=name%></td>
				</tr>
				<tr>
					<td>EMAIL:</td>
					<td><%=email%></td>
				</tr>
				<tr>
					<td>CONTACT:</td>
					<td><%=contact%></td>
				</tr>
				<tr>
					<td>CITY:</td>
					<td><%=city%></td>
				</tr>
			</table>


		</fieldset>
	</div>

</body>
</html>