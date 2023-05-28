<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: violet;">
	<%
		String username = (String) session.getAttribute("username");
	%>
	<h1>Logged in successfully</h1>
	<h2 style="padding: 10px 20px; background-color: cyan">User:
		<%=username %></h2>
	<a style="color: white; margin-right: 10px" href="success.jsp">Goto Success</a>
	<a style="color: white" href="page_2.jsp">Goto Page2</a>
</body>
</html>