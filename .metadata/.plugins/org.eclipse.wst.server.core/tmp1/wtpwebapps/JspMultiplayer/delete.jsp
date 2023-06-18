<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DELETE SONG</title>
</head>
<style>
body {
	background-image: url("./guitar-g0d73e44d5_1920.jpg");
	background-size: cover;
}

#sub {
	height: 35px;
	width: 95px;
	margin-left: 90px; background-color : transparent; background-color :
	aqua;
	text-align: center;
	border-radius: 10px;
	box-shadow: 3px 4px 3px black;
	margin-left: 90px;
	background-color: transparent;
	background-color: aqua;
}

#sub:hover {
	height: 39px;
	width: 95px;
	box-shadow: 3px 4px 3px black;
}

#a:hover {
	height: 39px;
	width: 95px;
	box-shadow: 3px 4px 3px black;
}

#a {
	height: 35px;
	width: 90px;
	border: 1px solid;
	border-radius: 10px;
	text-align: center;
	background-color: white;
	margin-left: 20px;
	background-color: transparent;
	box-shadow: 3px 4px 3px black;
}

a {
	text-decoration: none;
}

#box {
	display: flex;
	margin-top: 30px;
}

#add {
	margin-top: 35px;
	margin-left: 40px
}

#h1 {
	margin-left: 200px;
}
</style>
<body>
	<div align="center">
		<center>
			<h1 id="h1">DELETE SONG</h1>
		</center>
		<fieldset>
			<legend style="font-size: 20px;">Delete Song To the playList</legend>
			<form action="" method="post">
				<table>
					<tr>
						<td><h1>ENTER SONG ID TO DELETE SONG :</h1></td>
						<td><input
							style="background-color: transparent; border: none; border-bottom: 0.5px solid; outline: none;"
							type="text" name="id"></td>
					</tr>
					<tr>
						<td><input type="submit" id="sub">
							<button id="a">
								<a href="http://localhost:8082/JspMultiplayer/menu.jsp">GO
									BACK</a>
							</button></td>
					</tr>
				</table>
				<div id="box"></div>
			</form>
		</fieldset>

	</div>
	<%
	String id = request.getParameter("id");

	try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja1?user=root&password=root");
		int sid = Integer.parseInt(id);
		PreparedStatement preparedStatement = connection.prepareStatement("delete from multiplayer where Sid=?");
		preparedStatement.setInt(1, sid);

		int result = preparedStatement.executeUpdate();

		if (result == 1) {
			out.println("<h1>Song Delete successful</h1>");
		}

	} catch (Exception e) {
		e.printStackTrace();

	}
	%>





</body>
</html>