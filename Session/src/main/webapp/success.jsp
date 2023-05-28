<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body style="background-color: blue;">
	<%
	String username = (String) session.getAttribute("username");
	%>
	<h1>Logged in successfully</h1>
	<h2 style="padding: 10px 20px; background-color: cyan">
		User:
		<%=username%></h2>
	<a style="color: white; margin-right: 10px" href="page_1.jsp">Goto
		Page_1</a>
	<a style="color: white" href="page_2.jsp">Goto Page_2</a>
	<form action="Logout">
		<button id="btn-logout">Logout</button>
	</form>
</body>
</html>