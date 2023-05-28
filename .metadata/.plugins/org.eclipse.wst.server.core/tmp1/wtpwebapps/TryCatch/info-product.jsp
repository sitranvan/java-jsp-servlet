<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info Product</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
	integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
	integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
	crossorigin="anonymous"></script>
</head>
<body>
	<%
		String code = (String) request.getAttribute("code");
		String name = (String) request.getAttribute("name");
		String importPrice = (String) request.getAttribute("importPrice");
		String exportPrice = (String) request.getAttribute("exportPrice");
		String date = (String) request.getAttribute("date");
		String vat = (String) request.getAttribute("vat");
		String desc = (String) request.getAttribute("desc");
	%>
	<div class="container mt-4" style="max-width: 550px">
		<h1 class="py-4 text-secondary">INFO PRODUCTS</h1>
		<ul class="list-group">
			<li class="list-group-item">Code: ${code}</li>
			<li class="list-group-item">Name: ${name}</li>
			<li class="list-group-item">Import Price: ${importPrice}</li>
			<li class="list-group-item">Export Price: ${exportPrice}</li>
			<li class="list-group-item">Date: ${date}</li>
			<li class="list-group-item">VAT: ${vat}</li>
			<li class="list-group-item">Description: ${desc}</li>
		</ul>
	</div>
</body>
</html>