package tester;

import java.sql.Connection;

import dao.CustomerDAO;
import dao.ProducerDAO;
import model.Customer;
import model.Producer;
import utils.JDBCUtil;

public class TestJDBC {

	public static void main(String[] args) {
		CustomerDAO cus = new CustomerDAO();
     	cus.insert(new Customer("cus_07", "vanb", "12345", "vanb@gmail.com"));
	}
}
