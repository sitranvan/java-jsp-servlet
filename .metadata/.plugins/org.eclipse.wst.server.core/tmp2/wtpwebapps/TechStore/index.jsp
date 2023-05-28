<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Bootstrap</title>
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
</head>

<body class="bg-body-tertiary">
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg bg-white fixed-top">
		<div class="container">
			<a class="navbar-brand" href="#"> <img
				src="https://salt.tikicdn.com/ts/upload/e4/49/6c/270be9859abd5f5ec5071da65fab0a94.png"
				alt="Bootstrap" width="57" height="40" />
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item mx-1"><a class="nav-link active"
						aria-current="page" href="#">Trang chủ</a></li>
					<li class="nav-item mx-1"><a class="nav-link" href="#">Blog</a></li>
					<li class="nav-item dropdown mx-1"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Danh Mục </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="#">Smartphone</a></li>
							<li><a class="dropdown-item" href="#">Laptop</a></li>
							<li>
								<hr class="dropdown-divider" />
							</li>
							<li><a class="dropdown-item" href="#">Tablet</a></li>
						</ul></li>
					<li class="nav-item mx-1"><a href="register.jsp" class="nav-link">Đăng Ký /
							Đăng Nhập </a></li>
				</ul>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search" />
					<button class="btn btn-outline-primary" type="submit">
						Search</button>
				</form>
			</div>
		</div>
	</nav>
	<!-- Hero -->
	<div class="px-4 pt-5 mt-5 text-center">
		<img class="d-block mx-auto mb-4"
			src="https://getbootstrap.com/docs/5.3/assets/brand/bootstrap-logo.svg"
			alt="" width="72" height="57" />
		<h1 class="display-5 fw-bold text-body-emphasis">Tiki Bootstrap</h1>
		<div class="col-lg-6 mx-auto">
			<p class="lead mb-4">Quickly design and customize responsive
				mobile-first sites with Bootstrap, the world’s most popular
				front-end open source toolkit, featuring Sass variables and mixins,
				responsive grid system, extensive prebuilt components, and powerful
				JavaScript plugins.</p>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
				<button type="button" class="btn btn-primary btn-lg px-4 gap-3">
					Buy now!</button>
				<button type="button" class="btn btn-outline-secondary btn-lg px-4">
					Discover</button>
			</div>
		</div>
	</div>
	<!-- Content -->
	<div class="container mt-4">
		<!-- Product -->
		<div class="row">
			<div class="col-lg-3 mt-3">
				<div class="list-group">
					<a href="#"
						class="list-group-item list-group-item-action bg-primary text-white fw-medium"
						aria-current="true">Category </a> <a href="#"
						class="list-group-item list-group-item-action">Laptop </a> <a
						href="#" class="list-group-item list-group-item-action">Tablet
					</a> <a href="#" class="list-group-item list-group-item-action">Smartwatch
					</a>
				</div>
			</div>
			<div class="col-lg-9 mt-3">
				<div id="carouselExampleAutoplaying"
					class="rounded-slider carousel slide" data-bs-ride="carousel">
					<div class="carousel-indicators">
						<button type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide-to="0" class="active" aria-current="true"
							aria-label="Slide 1"></button>
						<button type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide-to="1" aria-label="Slide 2"></button>
						<button type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide-to="2" aria-label="Slide 3"></button>
					</div>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="images/slider-1.png" class="d-block w-100" alt="..." />
						</div>
						<div class="carousel-item">
							<img src="images/slider-2.png" class="d-block w-100" alt="..." />
						</div>
						<div class="carousel-item">
							<img src="images/slider-3.png" class="d-block w-100" alt="..." />
						</div>
					</div>
					<button class="carousel-control-prev" type="button"
						data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Previous</span>
					</button>
					<button class="carousel-control-next" type="button"
						data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Next</span>
					</button>
				</div>
				<div class="row mt-2">
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>

								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>

								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>
								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>
								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>
								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>
								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>
								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-6 card-wrap">
						<div class="card border-0">
							<img
								src="https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp"
								class="card-img-top" alt="..." />
							<div class="card-body">
								<h5 class="card-title fs-6">Samsung DXD20Pro</h5>
								<div class="d-flex align-items-center gap-x-2">
									<span class="d-flex align-items-center"> <span
										class="me-1">4.8</span> <svg
											xmlns="http://www.w3.org/2000/svg" width="12" height="12"
											fill="rgb(253, 216, 53)" class="bi bi-star-fill"
											viewBox="0 0 16 16">
                                            <path
												d="M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z" />
                                        </svg> <span class="fs-7 ms-3">
											Sold out 676 </span>
									</span>
								</div>
								<div class="d-flex gap-2 mt-1">
									<p class="card-text text-danger">20.000.000đ</p>
									<p class="card-text text-danger fs-8 fw-bold">-27%</p>
								</div>
								<a href="#" class="btn btn-primary">Buy now!</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Pagination -->
		<div class="d-flex align-items-center justify-content-center mt-5">
			<ul class="pagination">
				<li class="page-item"><a class="page-link" href="#">Previous</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">Next</a></li>
			</ul>
		</div>

		<!-- Footer -->
		<footer
			class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
			<div class="col-md-4 d-flex align-items-center">
				<a href="/"
					class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
					<svg class="bi" width="30" height="24">
                        <use xlink:href="#bootstrap"></use>
                    </svg>
				</a> <span class="mb-3 mb-md-0 text-muted">© 2022 Company, Inc</span>
			</div>

			<div class="col-md-5 offset-md-1 mb-3 mt-4">
				<form>
					<h5>Subscribe to our newsletter</h5>
					<p>Monthly digest of what's new and exciting from us.</p>
					<div class="d-flex flex-column flex-sm-row w-100 gap-2">
						<label for="newsletter1" class="visually-hidden">Email
							address</label> <input id="newsletter1" type="text" class="form-control"
							placeholder="Email address" />
						<button class="btn btn-primary" type="button">Subscribe</button>
					</div>
				</form>
			</div>
		</footer>
	</div>
</body>
</html>