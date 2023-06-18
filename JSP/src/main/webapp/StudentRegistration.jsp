<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT REGISTRATION</title>
</head>
<body>
	<div style="margin: 0 auto;">
		<fieldset>
			<legend>STUDENT REGISTRATION</legend>
			<form action="./StudentDetail.jsp" method="get">
				<table>
					<tr>
						<td>NAME</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>EMAIL</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>CONTACT</td>
						<td><input type="text" name="contact"></td>
					</tr>
					<tr>
						<td>CITY</td>
						<td><input type="text" name="city"></td>
					</tr>
				</table>
				<input type="submit" name="SUBMIT">
			</form>
		</fieldset>
	</div>

</body>
</html>