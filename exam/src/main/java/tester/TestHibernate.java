package tester;

import org.hibernate.Session;

import dao.EmployeeDAO;
import model.Employee;
import utils.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		Session ses = HibernateUtil.openSession();
		EmployeeDAO eDA0 = new EmployeeDAO();
		Employee e = new Employee();
		e.setName("vana");
		e.setEmail("vana@gmail.com");
		e.setYear(2002);
		eDA0.saveOrUpdate(e);
		
		ses.close();
	}
}
