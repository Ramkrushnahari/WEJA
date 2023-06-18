<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
<jsp:include page="IncludeActionTag2.jsp" />


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ActionTag IncludeDemo 1</title>
</head>
<body>
	<div align="center">
		<h1>Tag demo jsp 1</h1>
		<%!List<Integer> li = new ArrayList();%>
		<%
		li.add(1);
		li.add(2);
		li.add(3);
		%>
		<%
		for (Integer n : li) {
		%>
		<h3>
			<%=n%>
		</h3>
		<%
		}
		%>

	</div>
</body>
</html>