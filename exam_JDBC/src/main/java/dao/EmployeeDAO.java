package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Employee;
import utils.JDBCUtil;

public class EmployeeDAO {

	public ArrayList<Employee> selectAll() {
		ArrayList<Employee> data = new ArrayList<>();
		try (Connection conn = JDBCUtil.getConnection()) {
			String sql = "SELECT * FROM Employee";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int year = rs.getInt("year");
				String email = rs.getString("email");
				Employee em = new Employee(id, name, year, email);
				data.add(em);
			}
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}

	public Employee selectById(int idParam) {
		Employee em = null;
		try (Connection conn = JDBCUtil.getConnection()) {
			String sql = "SELECT * FROM Employee WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idParam);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int year = rs.getInt("year");
				String email = rs.getString("email");
				em = new Employee(id, name, year, email);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return em;
	}

	public int insert(Employee em) {
		try (Connection conn = JDBCUtil.getConnection()) {
			String sql = " INSERT INTO Employee(name, year, email) VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, em.getName());
			ps.setInt(2, em.getYear());
			ps.setString(3, em.getEmail());
			int i = ps.executeUpdate();
			if (i > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					em.setId(id);
				}
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(Employee em) {
		try (Connection conn = JDBCUtil.getConnection()) {
			String sql = "UPDATE Employee SET name=?, year=?,email=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, em.getName());
			ps.setInt(2, em.getYear());
			ps.setString(3, em.getEmail());
			int i = ps.executeUpdate();
			if(i>0) {
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(Employee em) {
		try (Connection conn = JDBCUtil.getConnection()) {
			String sql = "DELETE FROM ;Employee WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, em.getId());
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
