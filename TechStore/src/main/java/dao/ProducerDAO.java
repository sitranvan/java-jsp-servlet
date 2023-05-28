package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Producer;
import utils.JDBCUtil;

public class ProducerDAO implements InterfaceDAO<Producer> {
	@Override
	public ArrayList<Producer> selectAll() {
		ArrayList<Producer> listProducer = new ArrayList<Producer>();
		Connection conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM producer";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String producerId = rs.getString("producer_id");
				String producerName = rs.getString("producer_name");
				String producerAddress = rs.getString("producer_address");
				String producerIntro = rs.getString("producer_intro");
				Producer producer = new Producer(producerId, producerName, producerAddress, producerIntro);
				listProducer.add(producer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection(conn);
		}
		return listProducer;
	}

	@Override
	public Producer selectById(Producer t) {
		Producer producer = null;
		Connection conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM producer WHERE producer_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getProducerID());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String producerId = rs.getString("producer_id");
				String producerName = rs.getString("producer_name");
				String producerAddress = rs.getString("producer_address");
				String producerIntro = rs.getString("producer_intro");
				producer = new Producer(producerId, producerName, producerAddress, producerIntro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection(conn);
		}
		return producer;
	}

	@Override
	public int insert(Producer t) {
		int result = 0;
		Connection conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO producer(producer_id, producer_name, producer_address,producer_intro)"
				+ "VALUES(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getProducerID());
			ps.setString(2, t.getProducerName());
			ps.setString(3, t.getProducerAddress());
			ps.setString(4, t.getProducerIntro());
			 result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection(conn);
		}
		return result;
	}

	@Override
	public int insertAll(ArrayList<Producer> arrT) {
		int result = 0;
		for (Producer producer : arrT) {
			result+=this.insert(producer);
		}
		return result;
	}

	@Override
	public int delete(Producer t) {
		int result = 0;
		Connection conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM producer WHERE producer_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(0, t.getProducerID());
			 result = ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection(conn);
		}
		return result;
	}

	@Override
	public int deleteAll(ArrayList<Producer> arrT) {
		int result = 0;
		for (Producer producer : arrT) {
			result+=this.delete(producer);
		}
		return result;
	}

	@Override
	public int update(Producer t) {
		int result = 0;
		Connection conn = JDBCUtil.getConnection();
		String sql = "UPDATE producer SET producer_name=?, producer_address=?, producer_intro=?"
				+ "WHERE producer_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getProducerName());
			ps.setString(2, t.getProducerAddress());
			ps.setString(3, t.getProducerIntro());
			ps.setString(4, t.getProducerID());
			 result = ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
