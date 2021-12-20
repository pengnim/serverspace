package ch17_servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 메모리에 있는 메도스 호출이 일어나야 실행
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "scott");

			con.setAutoCommit(false);// true:commit 실행
										// false: commint할수 있는 시작점(Transaction 시작)
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {

		}
	}

	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {

		}
	}

	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {

		}
	}

	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {

		}
	}

	// transaction 처리 메소드
	public static void commit(Connection con) {
		try {
			con.commit();// insert,update,delete
		} catch (SQLException e) {

		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();// insert,update,delete
		} catch (SQLException e) {

		}
	}
}
