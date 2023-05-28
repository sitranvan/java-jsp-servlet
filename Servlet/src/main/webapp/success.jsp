<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = (String) request.getAttribute("username");
		String password = (String) request.getAttribute("password");
	%>
	<h1>Logged in successfully</h1>
	<h2 class="text-primary">${username}</h2>
	<h2>${password}</h2>
</body>
</html>