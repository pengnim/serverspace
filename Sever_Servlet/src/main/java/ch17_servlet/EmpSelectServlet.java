package ch17_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpSelectServlet
 */
@WebServlet("/ch17_servlet/EmpSelect")
public class EmpSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String sql = "SELECT * FROM emp05";
		
		Connection con = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			pstmt =con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			out.println("<html><body>");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int sal = rs.getInt(3);
				int dno = rs.getInt(4);
				out.print(id + " " + name + " " + sal + " " + dno + "<br>");

			}
			out.println("</body></html>");

		} catch (SQLException e) {

		} finally {
			
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

}
