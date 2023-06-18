<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int[] a = { 9, 4, 6, 8, 3, 8 };%>
	<%
	if (a[0] > a[1]) {
		int k = a[0];
		a[0] = a[1];
		a[1] = k;
	}
	%>
	<%
	for (int i = 0; i < a.length; i++) {
	%>

	<%=a[i]%>

	<%
	}
	%>
</body>
</html>