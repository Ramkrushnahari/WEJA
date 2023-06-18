<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student Detailas</title>
</head>
<body>
	<div align="center">

		<form action="./StudentInfo.jsp">
			<fieldset>
				<legend style="margin: auto;"><b>Student Form..</b></legend>
				<table>

					<tr>
						<th>Name :</th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th>Email :</th>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<th>Address :</th>
						<td><input type="text" name="Add"></td>
					</tr>
					<tr>
						<th>Contact :</th>
						<td><input type="text" name="contact"></td>
					</tr>

				</table>
				<input type="submit" value="Submit">
			</fieldset>
		</form>
	</div>
</body>
</html>