package study08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PersonalInfo pi = new PersonalInfo();

		pi.setName("홍길동");
		pi.setAge(24);
		pi.setGender('남');

		req.setAttribute("pinfo", pi);
		RequestDispatcher d = req.getRequestDispatcher("/study08/customerinfoViewer.jsp");
		d.forward(req, resp);

	}

}
