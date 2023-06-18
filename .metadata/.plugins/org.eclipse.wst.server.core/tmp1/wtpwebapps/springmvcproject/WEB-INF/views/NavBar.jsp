<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title></title>
<style type="text/css">
fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: white;
	background-color: #333;
}

ul {
	list-style-type: none;
	background-color: black;
	overflow: hidden;
	background-color: #333;
}

li {
	float: right;
}

li a {
	display: block;
	margin: 0px;
	padding: 15px;
}

li a:hover {
	/*background-color: #111;*/
	background-image: linear-gradient(red, yellow);
}
</style>
</head>
<body>

	<ul>
		<li><a style="color: white;" href="./logout"><i
				class="fa fa-fw fa-user"></i>Logout</a></li>
		<li><a style="color: white;" href="./search"><i
				class="fa fa-fw fa-search"></i>Search</a></li>
		<li><a style="color: white;" href="./add"><i
				class="fa fa-plus-circle" aria-hidden="true"></i> Add</a></li>
		<li><a style="color: white;" href="./update"><i
				class="fa fa-pencil" aria-hidden="true"></i> Update</a></li>
		<li><a style="color: white;" href="./remove"><i
				class="fa fa-minus-circle" aria-hidden="true"></i>Remove</a></li>
		<li><a style="color: white;" href="./home"><i
				class="fa fa-fw fa-home"></i>Home</a></li>
	</ul>
</body>
</html>