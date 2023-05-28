package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import model.Employee;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet(name = "update-employee", urlPatterns = { "/update-employee" })
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
     EmployeeDAO eDAO = new EmployeeDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idParam = request.getParameter("id");
		int id = Integer.parseInt(idParam);
		String name = request.getParameter("name");
		String yearParam = request.getParameter("year");
		int year = Integer.parseInt(yearParam);
		String email = request.getParameter("email");
		Employee e = eDAO.selectById(id);
		eDAO.saveOrUpdate(new Employee(e.getId(),name,year, email));
		response.sendRedirect("view/list-employee.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
