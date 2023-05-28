<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
</head>
<body>
	<%
	String fullName = request.getParameter("fullName");
	String phone = request.getParameter("phone");
	String quantity = request.getParameter("quantity");
	%>
	<h1>Order confirmation</h1>
	<ul>
		<li>FullName: <%=fullName%></li>
		<li>Phone: <%=phone%></li>
		<li>Quantity: <%=quantity%></li>
	</ul>
</body>
</html>