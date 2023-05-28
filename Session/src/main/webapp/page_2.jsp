<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page_2</title>
</head>
<body style="background-color: red;">
	<%
	String username = (String) session.getAttribute("username");
	%>
	<h1>Logged in successfully</h1>
	<h2 style="padding: 10px 20px; background-color: cyan">
		User:
		<%=username%></h2>
	<a style="color: white; margin-right: 10px" href="page_1.jsp">Goto
		Page1</a>
	<a style="color: white" href="success.jsp">Goto Success</a>
</body>
</html>