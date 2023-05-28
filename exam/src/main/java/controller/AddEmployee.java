package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import model.Employee;

@WebServlet("/add-employee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDAO eDAO = new EmployeeDAO();

	public AddEmployee() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String yearParam = request.getParameter("year");
		String email = request.getParameter("email");
		int id = Integer.parseInt(yearParam);
		Employee e = new Employee(name, id, email);
		System.out.println(e);
		eDAO.saveOrUpdate(e);
		response.sendRedirect("view/list-employee.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
