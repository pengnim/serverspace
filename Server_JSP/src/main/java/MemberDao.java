import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join.jsp")
public class MemberDao extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static MemberDao dao;
	private MemberDao() {
		
	}
	
	public static MemberDao getInstance() {
		if(dao==null) dao = new MemberDao();
		return dao;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=utf-8");

		con = getConnection();
		PreparedStatement pstmt = null;
		int insertCount = 0;
		Member dto = new Member();
		String sql = "INSERT INTO member1 VALUES(?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setDate(4, dto.getDate());

			insertCount = pstmt.executeUpdate();
			if(insertCount > 0) {
				RequestDispatcher d = req.getRequestDispatcher("main.jsp");
				d.forward(req, resp);//목적파일 출력
				
			}else {
				resp.sendRedirect("joinform.jsp");
			}
		} catch (SQLException e) {

		} finally {
			close(pstmt);
		}
		
	}

	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// DB연결 완료된 상태
	public static Connection getConnection() {
		Connection conn = null;
		try {

			conn = DriverManager.getConnection(url, "javalink", "javalink");
			conn.setAutoCommit(false);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
