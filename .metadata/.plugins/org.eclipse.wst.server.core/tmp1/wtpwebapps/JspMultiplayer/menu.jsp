<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MUSICPLAYER</title>
</head>
<style>
body {
	margin: 0;
	background-image: url(./headsets-gc143b686e_1920.jpg);
	background-position: center;
	background-repeat: no-repeat;
}

a {
	text-decoration: none;
	top: 15px;
}

a:hover {
	height: 23px;
	width: 130px;
	box-shadow: 3px 4px 3px black;
}

h1 {
	margin: auto;
}

#div {
	margin-top: 25px;
	margin-left: 30px;
	height: 500px;
	width: 130px;
	display: flex;
	flex-direction: column;
}

a {
	height: 30px;
	width: 130px;
	border: 1px solid;
	text-align: center;
	margin-top: 5px;
}

#a1 {
	margin-top: 20px;
}
</style>
<body>
	<center>
		<h1>WELCOME TO MUSIC PLAYER APPLICATION</h1>
	</center>
	<div align="center">
		<fieldset>
			<legend style="font-size: 20px;">Menu....</legend>
			<div id="div">
				<a id="a1" href="http://localhost:8082/JspMultiplayer/add.jsp">ADD
					SONG</a> <a id="a1"
					href="http://localhost:8082/JspMultiplayer/play.jsp">PLAY SONG</a>
				<a id="a1" href="http://localhost:8082/JspMultiplayer/delete.jsp">DELETE
					SONG</a> <a id="a1"
					href="http://localhost:8082/JspMultiplayer/update.jsp">UPDATE
					SONG</a>
			</div>
		</fieldset>
	</div>

</body>
</html>