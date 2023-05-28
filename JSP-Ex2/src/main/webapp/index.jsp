<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>JSP-Ex2</title>
</head>
<body>
	<div class="container d-flex justify-content-center">
		<form class="row g-3 p-5" action="order.jsp" method="get">
			<div class="col-12">
				<label for="fullName" class="form-label">FullName</label> <input
					type="text" class="form-control" id="fullName" name="fullName"
					placeholder="Ex: Jonh" autocomplete="none">
			</div>
			<div class="col-12">
				<label for="phone" class="form-label">Phone</label> <input
					type="text" class="form-control" id="phone"
					placeholder="Ex: 0369060306" autocomplete="none" name="phone">
			</div>
			<div class="col-12">
				<label for="quantity" class="form-label">Quantity</label> <input
					type="text" class="form-control" id="quantity" name="quantity"
					placeholder="Ex:12" autocomplete="none">
			</div>
			
			<div class="col-12">
				<button type="submit" class="btn btn-primary">Buy Now</button>
			</div>
		</form>
	</div>
</body>
</html>