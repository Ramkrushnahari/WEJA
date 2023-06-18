<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo 1</title>
</head>
<body>
	<h1>hello java</h1>
	<%! List li= new ArrayList(); %>
	<% li.add(1);
		li.add(2);
	%>
	<%="list are: "+li %>
</body>
</html>