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
<title>Login</title>
</head>
<body>
	<div class="container" style="max-width: 450px">
		<main class="form-signin mt-5">
			<form class="d-flex flex-column gap-2" action="Login" method="POST">
				<img class="mb-4 d-block mx-auto"
					src="https://getbootstrap.com/docs/5.0/assets/brand/bootstrap-logo.svg"
					alt="" width="72" height="57">
				<h1 class="h3 mb-3 fw-normal">Please sign in</h1>

				<div class="form-floating">
					<input type="text" class="form-control" id="floatingUsername"
						name="username" placeholder="Username"> <label
						for="floatingUsername">Username</label>
				</div>
				<div class="form-floating">
					<input type="password" class="form-control" id="floatingPassword"
						name="password" placeholder="Password"> <label
						for="floatingPassword">Password</label>
				</div>

				<div class="checkbox mb-3">
					<label> <input type="checkbox" value="remember-me">
						Remember me
					</label>
				</div>
				<button class="w-100 btn btn-lg btn-primary" type="submit">Sign
					in</button>
				<p class="mt-5 mb-3 text-muted">© 2017–2021</p>
			</form>
		</main>
	</div>
</body>
</html>