<%@page import="com.jspider.springmvc.pojo.AdminPOJO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp" />
<%
String msg = (String) request.getAttribute("msg");
AdminPOJO admin = (AdminPOJO) request.getAttribute("username");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Employee Management</h1>
	</div>

</body>
</html>