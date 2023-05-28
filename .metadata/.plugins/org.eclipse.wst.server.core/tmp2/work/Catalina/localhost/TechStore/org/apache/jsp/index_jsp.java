/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-05-03 18:43:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\" />\r\n");
      out.write("	<title>Bootstrap</title>\r\n");
      out.write("	<link\r\n");
      out.write("		href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\r\n");
      out.write("		rel=\"stylesheet\"\r\n");
      out.write("		integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\r\n");
      out.write("		crossorigin=\"anonymous\" />\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/myStyle.css\" />\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE\"\r\n");
      out.write("		crossorigin=\"anonymous\">\r\n");
      out.write("	</script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ\"\r\n");
      out.write("		crossorigin=\"anonymous\">\r\n");
      out.write("	</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-body-tertiary\">\r\n");
      out.write("	<!-- Navbar -->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg bg-white fixed-top\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("				src=\"https://salt.tikicdn.com/ts/upload/e4/49/6c/270be9859abd5f5ec5071da65fab0a94.png\"\r\n");
      out.write("				alt=\"Bootstrap\" width=\"57\" height=\"40\" />\r\n");
      out.write("			</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("					<li class=\"nav-item mx-1\"><a class=\"nav-link active\"\r\n");
      out.write("						aria-current=\"page\" href=\"#\">Trang chủ</a></li>\r\n");
      out.write("					<li class=\"nav-item mx-1\"><a class=\"nav-link\" href=\"#\">Blog</a></li>\r\n");
      out.write("					<li class=\"nav-item dropdown mx-1\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\r\n");
      out.write("						data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Danh Mục </a>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Smartphone</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Laptop</a></li>\r\n");
      out.write("							<li>\r\n");
      out.write("								<hr class=\"dropdown-divider\" />\r\n");
      out.write("							</li>\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Tablet</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li class=\"nav-item mx-1\"><a href=\"register.jsp\" class=\"nav-link\">Đăng Ký /\r\n");
      out.write("							Đăng Nhập </a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<form class=\"d-flex\" role=\"search\">\r\n");
      out.write("					<input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\"\r\n");
      out.write("						aria-label=\"Search\" />\r\n");
      out.write("					<button class=\"btn btn-outline-primary\" type=\"submit\">\r\n");
      out.write("						Search</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- Hero -->\r\n");
      out.write("	<div class=\"px-4 pt-5 mt-5 text-center\">\r\n");
      out.write("		<img class=\"d-block mx-auto mb-4\"\r\n");
      out.write("			src=\"https://getbootstrap.com/docs/5.3/assets/brand/bootstrap-logo.svg\"\r\n");
      out.write("			alt=\"\" width=\"72\" height=\"57\" />\r\n");
      out.write("		<h1 class=\"display-5 fw-bold text-body-emphasis\">Tiki Bootstrap</h1>\r\n");
      out.write("		<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("			<p class=\"lead mb-4\">Quickly design and customize responsive\r\n");
      out.write("				mobile-first sites with Bootstrap, the world’s most popular\r\n");
      out.write("				front-end open source toolkit, featuring Sass variables and mixins,\r\n");
      out.write("				responsive grid system, extensive prebuilt components, and powerful\r\n");
      out.write("				JavaScript plugins.</p>\r\n");
      out.write("			<div class=\"d-grid gap-2 d-sm-flex justify-content-sm-center\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-primary btn-lg px-4 gap-3\">\r\n");
      out.write("					Buy now!</button>\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-secondary btn-lg px-4\">\r\n");
      out.write("					Discover</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Content -->\r\n");
      out.write("	<div class=\"container mt-4\">\r\n");
      out.write("		<!-- Product -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-3 mt-3\">\r\n");
      out.write("				<div class=\"list-group\">\r\n");
      out.write("					<a href=\"#\"\r\n");
      out.write("						class=\"list-group-item list-group-item-action bg-primary text-white fw-medium\"\r\n");
      out.write("						aria-current=\"true\">Category </a> <a href=\"#\"\r\n");
      out.write("						class=\"list-group-item list-group-item-action\">Laptop </a> <a\r\n");
      out.write("						href=\"#\" class=\"list-group-item list-group-item-action\">Tablet\r\n");
      out.write("					</a> <a href=\"#\" class=\"list-group-item list-group-item-action\">Smartwatch\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-lg-9 mt-3\">\r\n");
      out.write("				<div id=\"carouselExampleAutoplaying\"\r\n");
      out.write("					class=\"rounded-slider carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("					<div class=\"carousel-indicators\">\r\n");
      out.write("						<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\r\n");
      out.write("							data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\r\n");
      out.write("							aria-label=\"Slide 1\"></button>\r\n");
      out.write("						<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\r\n");
      out.write("							data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("						<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\r\n");
      out.write("							data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"carousel-inner\">\r\n");
      out.write("						<div class=\"carousel-item active\">\r\n");
      out.write("							<img src=\"images/slider-1.png\" class=\"d-block w-100\" alt=\"...\" />\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"carousel-item\">\r\n");
      out.write("							<img src=\"images/slider-2.png\" class=\"d-block w-100\" alt=\"...\" />\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"carousel-item\">\r\n");
      out.write("							<img src=\"images/slider-3.png\" class=\"d-block w-100\" alt=\"...\" />\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<button class=\"carousel-control-prev\" type=\"button\"\r\n");
      out.write("						data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"prev\">\r\n");
      out.write("						<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("						<span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("					</button>\r\n");
      out.write("					<button class=\"carousel-control-next\" type=\"button\"\r\n");
      out.write("						data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"next\">\r\n");
      out.write("						<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("						<span class=\"visually-hidden\">Next</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row mt-2\">\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-lg-3 col-md-4 col-sm-6 card-wrap\">\r\n");
      out.write("						<div class=\"card border-0\">\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/280x280/ts/product/12/70/13/941e4cee081c3aa9078f5d85cef5d4fb.jpg.webp\"\r\n");
      out.write("								class=\"card-img-top\" alt=\"...\" />\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title fs-6\">Samsung DXD20Pro</h5>\r\n");
      out.write("								<div class=\"d-flex align-items-center gap-x-2\">\r\n");
      out.write("									<span class=\"d-flex align-items-center\"> <span\r\n");
      out.write("										class=\"me-1\">4.8</span> <svg\r\n");
      out.write("											xmlns=\"http://www.w3.org/2000/svg\" width=\"12\" height=\"12\"\r\n");
      out.write("											fill=\"rgb(253, 216, 53)\" class=\"bi bi-star-fill\"\r\n");
      out.write("											viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("												d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\r\n");
      out.write("                                        </svg> <span class=\"fs-7 ms-3\">\r\n");
      out.write("											Sold out 676 </span>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"d-flex gap-2 mt-1\">\r\n");
      out.write("									<p class=\"card-text text-danger\">20.000.000đ</p>\r\n");
      out.write("									<p class=\"card-text text-danger fs-8 fw-bold\">-27%</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a href=\"#\" class=\"btn btn-primary\">Buy now!</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- Pagination -->\r\n");
      out.write("		<div class=\"d-flex align-items-center justify-content-center mt-5\">\r\n");
      out.write("			<ul class=\"pagination\">\r\n");
      out.write("				<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Previous</a></li>\r\n");
      out.write("				<li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("				<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("				<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("				<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Next</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Footer -->\r\n");
      out.write("		<footer\r\n");
      out.write("			class=\"d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top\">\r\n");
      out.write("			<div class=\"col-md-4 d-flex align-items-center\">\r\n");
      out.write("				<a href=\"/\"\r\n");
      out.write("					class=\"mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1\">\r\n");
      out.write("					<svg class=\"bi\" width=\"30\" height=\"24\">\r\n");
      out.write("                        <use xlink:href=\"#bootstrap\"></use>\r\n");
      out.write("                    </svg>\r\n");
      out.write("				</a> <span class=\"mb-3 mb-md-0 text-muted\">© 2022 Company, Inc</span>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-md-5 offset-md-1 mb-3 mt-4\">\r\n");
      out.write("				<form>\r\n");
      out.write("					<h5>Subscribe to our newsletter</h5>\r\n");
      out.write("					<p>Monthly digest of what's new and exciting from us.</p>\r\n");
      out.write("					<div class=\"d-flex flex-column flex-sm-row w-100 gap-2\">\r\n");
      out.write("						<label for=\"newsletter1\" class=\"visually-hidden\">Email\r\n");
      out.write("							address</label> <input id=\"newsletter1\" type=\"text\" class=\"form-control\"\r\n");
      out.write("							placeholder=\"Email address\" />\r\n");
      out.write("						<button class=\"btn btn-primary\" type=\"button\">Subscribe</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
