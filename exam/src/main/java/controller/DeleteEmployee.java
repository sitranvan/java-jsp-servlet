package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import model.Employee;

@WebServlet(name = "delete-employee", urlPatterns = { "/delete-employee" })
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDAO eDAO = new EmployeeDAO();

	public DeleteEmployee() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParam = request.getParameter("id");
		int id = Integer.parseInt(idParam);
		Employee e = eDAO.selectById(id);
		eDAO.delete(e);
		response.sendRedirect("view/list-employee.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
