package Test;
import dao.EmployeeDAO;

public class TestJDBC {
	public static void main(String[] args) {
		System.out.println(new EmployeeDAO().selectById(1));
	}
}
