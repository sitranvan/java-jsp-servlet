<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>

</head>
<body>
	<%
		Employee em = (Employee) session.getAttribute("em");
	%>
	<div
		style="display: flex; flex-direction: column; align-items: center; justify-content: center;">
		<h1>EDIT EMPLOYEE</h1>
		<form action="../update-employee" method="get">
			<table>
				<tr>
					<td>name:</td>
					<td><input name="name" value=<%=em.getName() %> placeholder="" type="text" /></td>
				</tr>
				<tr>
					<td>year:</td>
					<td><input name="year" value=<%=em.getYear() %> placeholder="" type="text" /></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input name="email" value="<%=em.getEmail() %>" placeholder="" type="text" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;">
						<button id="edit-btn" type="submit">Edit</button>
						 <input type="hidden" name="id" value="<%=em.getId()%>">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>

</html>




