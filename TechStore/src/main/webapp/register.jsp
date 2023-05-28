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
		crossorigin="anonymous" />
	<link rel="stylesheet" type="text/css" href="css/myStyle.css" />
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
		integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
		integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
		crossorigin="anonymous">
		
	</script>
	<title>Register/Login</title>
</head>
<body>
	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="register" method="post">
						<h1 class="py-4 text-primary">Đăng ký</h1>
						<!-- Usernmae input -->
						<div class="form-outline mb-4">
							<label class="form-label" for="username">Tên đăng nhập</label> <input
								type="text" id="username" class="form-control form-control-lg"
								placeholder="Nhập tên đăng nhập" name="username" />
						</div>
						<!-- Email input -->
						<div class="form-outline mb-4">
							<label class="form-label" for="email">Email</label> <input
								type="email" id="email" class="form-control form-control-lg"
								placeholder="Nhập địa chỉ email" name="email" />
						</div>

						<!-- Password input -->
						<div class="form-outline mb-3">
							<label class="form-label" for="password">Mật khẩu</label> <input
								type="password" id="password"
								class="form-control form-control-lg" placeholder="Nhập mật khẩu"
								name="password" />
						</div>

						<div class="d-flex justify-content-between align-items-center">
							<!-- Checkbox -->
							<div class="form-check mb-0">
								<input class="form-check-input me-2" type="checkbox" value=""
									id="form2Example3" /> <label class="form-check-label"
									for="form2Example3"> Đồng ý với các điều khoản </label>
							</div>
							<a href="#!" class="text-body">Quên mật khẩu?</a>
						</div>

						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Đăng
								ký</button>
							<p class="small fw-bold mt-2 pt-1 mb-0">
								Đã có tài khoản? <a href="login.jsp" class="link-danger">Đăng
									nhập</a>
							</p>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>