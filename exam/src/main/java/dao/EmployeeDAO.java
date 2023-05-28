package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import model.Employee;
import utils.HibernateUtil;

public class EmployeeDAO {
	
	public List<Employee> selectAll() {
		try(Session ses = HibernateUtil.openSession()) {
			return ses.createQuery("from Employee", Employee.class).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Employee selectById(int id) {
		try(Session ses = HibernateUtil.openSession()) {
			return ses.get(Employee.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int saveOrUpdate(Employee em) {
		try(Session ses = HibernateUtil.openSession()) {
			Transaction tran = ses.beginTransaction();
			ses.saveOrUpdate(em);
			tran.commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int delete(Employee em) {
		try(Session ses = HibernateUtil.openSession()) {
			Transaction tran = ses.beginTransaction();
			ses.delete(em);
			tran.commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Employee> selectByYear(int year) {
		try (Session ses = HibernateUtil.openSession()) {
			Query<Employee> query = ses.createQuery("FROM Employee WHERE year = :year", Employee.class);
			query.setParameter("year", year);
			return query.getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
