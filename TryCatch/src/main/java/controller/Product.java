package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String importPrice = request.getParameter("import-price");
		String exportPrice = request.getParameter("export-price");
		String date = request.getParameter("date");
		String vat = request.getParameter("vat");
		String desc = request.getParameter("desc");
		
		
		request.setAttribute("code", code);
		request.setAttribute("name", name);
		request.setAttribute("importPrice", importPrice);
		request.setAttribute("exportPrice", exportPrice);
		request.setAttribute("date", date);
		request.setAttribute("vat", vat);
		request.setAttribute("desc", desc);
		String url ="";
		if (code == null || code.isEmpty()) {
			 url = "/product.jsp";
		} else if (code.equalsIgnoreCase("123")) {
		    request.setAttribute("exists", "Product code already exists");
		    response.getWriter().append("Product code already exists");
		} else {
		    url = "/info-product.jsp";
		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
