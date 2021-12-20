package ch17_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch17_servlet/EmpInsert.do")
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		//html에서 값 받아오기
		String ename = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		int sal = Integer.parseInt(request.getParameter("sal"));
		int dno = Integer.parseInt(request.getParameter("dno"));
		
		//db연결
		Connection con = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		try {

			//db에 내용 넣기
			String sql = "insert into emp05 values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, id);
			pstmt.setString(2, ename);
			pstmt.setInt(3, sal);
			pstmt.setInt(4, dno);

			int insertCount = 0;
			insertCount = pstmt.executeUpdate();

			if (insertCount == 0)
				out.print("<html><body>저장완료<br> <a href='EmpSelect'>목록보러가기</a></body></html>");
			

		} catch (SQLException e) {
			out.print("<html><body>저장실패<br> <a href='../ch17_servlet/insertForm.html'>다시입력</a></body></html>");
			
		} finally {

			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);

		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
