package study09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study/study09/CartDeleteCookie")
public class CartDeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>장바구니 비웠음<br>");
		Cookie[] cookies = req.getCookies();
		if (cookies != null || cookies.length != 0) {

			for (Cookie c : cookies) {
				c.setMaxAge(0); //쿠키만료(삭제)
				resp.addCookie(c);
			}

		} else {
			out.print("no Item");
		}
		
		out.print("<a href='cookie.html'/>상품선택 페이지<br>");
		out.print("</body></html>");

	}

}
