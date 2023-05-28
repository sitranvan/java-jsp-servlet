<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
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
	<div class="container" style="max-width: 550px">
		<h1 class="py-4 text-secondary">PRODUCTS INVOICE</h1>
		<form class="row g-3" action="Product" method="GET">
			<div class="row">
				<div class="col-md-6">
					<label for="code" class="form-label">Code</label> <input
						type="text" class="form-control" id="code" value="${code}" name="code"
						placeholder="C123" required>
						  
				</div>
				<div class="col-md-6">
					<label for="name" class="form-label">Name</label> <input
						type="text" class="form-control" value=${name} id="name" name="name"
						placeholder="BWM" required>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<label for="import-price" class="form-label">Import Price</label> <input
						type="text" class="form-control" id="import-price"
						name="import-price" placeholder="100.000$" value=${importPrice} required>
				</div>
				<div class="col-md-6">
					<label for="export-price" class="form-label">Export Price</label> <input
						type="text" class="form-control" id="export-price"
						name="export-price"  placeholder="120.000$"  required value=${exportPrice}>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<label for="date" class="form-label">Date</label> <input
						type="datetime-local" class="form-control" id="date" name="date"
						value=${date} required>
				</div>
				<div class="col-md-6">
					<label for="vat" class="form-label">VAT</label> <input type="text"
						class="form-control" id="vat" name="vat" placeholder="10%"
						value=${vat} required>
				</div>
			</div>
			<div class="col-md-12">
				<label for="desc" class="form-label">Description</label>
				<textarea name="desc" id="desc" rows="5" class="form-control"
					 required>${desc}</textarea>
			</div>
			<div class="col-12">
				<button class="btn btn-primary" type="submit">Submit form</button>
			</div>
		</form>
	</div>
</body>
</html>