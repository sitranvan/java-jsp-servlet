package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	private static final String URL = "jdbc:mysql://localhost/exam_jdbc";
	private static final String USER = "root";
	private static final String PASSWORD ="";
	
	public static Connection getConnection( ) {
		Connection conn = null;
		if(conn==null) {
			try {
				conn = DriverManager.getConnection(URL,USER,PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
