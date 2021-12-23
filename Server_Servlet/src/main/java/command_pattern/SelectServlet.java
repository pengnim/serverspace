package command_pattern;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//529~530
@WebServlet("*.ds")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Command Pattern
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String requestURI = request.getRequestURI();
		System.out.println("requestURI : " + requestURI);
		String contextPath = request.getContextPath();
		System.out.println("contextPath : " + contextPath);
		String command = requestURI.substring(contextPath.length());
		System.out.println("command : " + command);

		out.print("<html><body>");

		if (command.equals("/insert.ds")) {
			System.out.println("DB에 데이터 입력");
		} else if (command.equals("/delete.ds")) {
			System.out.println("DB에 데이터 삭제");
		} else if (command.equals("/update.ds")) {
			System.out.println("DB에 데이터 수정");
		} else {
			System.out.println("DB에 데이터 조회");
			SelectService service = new SelectService();

			try {
				ArrayList<EmpDTO> arr = service.execute(request, response);
				for (EmpDTO dto : arr) {
					out.println(dto + "<br>");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
