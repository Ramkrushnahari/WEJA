<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JspDemoTag</title>
</head>
<body>
	<%! 
		int a=10;
		int b=20;
		int c=0;
	%>
	<%! 
		public int add(){
			return a+b;
		}
	%>
	<% c=add(); %>
	<%= c %>
</body>
</html>