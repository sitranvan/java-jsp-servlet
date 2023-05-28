<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
</head>
<body>

	<div
		style="display: flex; flex-direction: column; align-items: center; justify-content: center;">
		<h1>ADD EMPLOYEE JDBC</h1>
		<form action="../add-employee" method="get">
			<table>
				<tr>
					<td>name:</td>
					<td><input name="name" placeholder="" type="text" /></td>
				</tr>
				<tr>
					<td>year:</td>
					<td><input name="year" placeholder="" type="text" /></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input name="email" placeholder="" type="text" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;">
						<button type="submit">Add</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>