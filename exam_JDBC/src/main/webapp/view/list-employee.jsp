<%@page import="dao.EmployeeDAO"%>
<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body style="margin-top: 50px; display: flex; justify-content: center;">
	<%
		List<Employee> data = new EmployeeDAO().selectAll();
	%>
	<div>
		<h1 style="text-align: center;">LIST EMPLOYEE</h1>
		<table border="1">
			<thead>
				<tr>
					<th>UUID</th>
					<th>Name</th>
					<th>Year</th>
					<th>Email</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Employee e : data) {
				%>
				<tr>
					<td><%=e.getId()%></td>
					<td><%=e.getName()%></td>
					<td><%=e.getYear()%></td>
					<td><%=e.getEmail()%></td>
					<td>
					<a href="../edit-employee?id=<%=e.getId()%>">Edit</a> <a
						href="../delete-employee?id=<%=e.getId()%>">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>


</body>
</html>