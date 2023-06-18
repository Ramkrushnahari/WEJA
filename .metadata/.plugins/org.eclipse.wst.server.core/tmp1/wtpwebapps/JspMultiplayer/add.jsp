<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>




<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD SONG PAGE</title>
</head>
<style>
body {
	background-image: url(./guitar-g0d73e44d5_1920.jpg);
	background-size: cover;
}

#sub {
	height: 35px;
	width: 90px;
	margin-left: 90px;
	background-color:;
	text-align: center;
	border-radius: 10px;
}

#sub:hover {
	height: 39px;
	width: 97px;
	box-shadow: 3px 4px 3px black;
}

#a:hover {
	height: 39px;
	width: 95px;
	box-shadow: 3px 4px 3px black;
}

input {
	border: none;
	border-bottom: 0.5px solid black;
	outline: none;
	background-color: transparent;
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
	color: "Black";
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
	margin-left: 200px
}
</style>
<body>
	<center>
		<h1 id="h1">ADD SONG</h1>
	</center>

	<div id="add" align="center">
		<fieldset>
			<legend style="font-size: 20px;">Add Song To the playList</legend>
			<form action="">
				<table>
					<tr>
						<td><h1>SONG ID :</h1></td>
						<td><input type="text" name="songId"></td>


					</tr>
					<br>
					<tr></tr>
					<tr>
						<td><h1>SONG NAME :</h1></td>
						<td><input type="text" name="songName"></td>

					</tr>

					<tr>
						<td><h1>SINGER NAME :</h1></td>
						<td><input type="text" name="singerName"></td>

					</tr>
					<tr>
						<td><input type="submit" id="sub">
							<button id="a">
								<a href="http://localhost:8082/JspMultiplayer/menu.jsp">GO
									BACK</a>
							</button></td>
					</tr>
				</table>

			</form>
		</fieldset>

	</div>

	<%
	response.setContentType("text/html");
	String id = request.getParameter("songId");

	String sname = request.getParameter("songName");
	String singer = request.getParameter("singerName");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja1", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into multiplayer values (?,?,?)");
		int sid = Integer.parseInt(id);

		preparedStatement.setInt(1, sid);
		preparedStatement.setString(2, sname);
		preparedStatement.setString(3, singer);

		int result = preparedStatement.executeUpdate();
		if (result == 1) {
			out.println(result+"<h1 > Add song Successfully..!!!</h>");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

</body>
</html>