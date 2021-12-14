package study09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study/study09/CartBasketCookie")
public class CartBasketCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>장바구니 리스트<br>");

		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (Cookie c : cookies) {
				out.print(c.getName() + " : " + c.getValue()+"<br>");
			}

		} else {
			out.print("장바구니가 비어있음<br>");
		}

		out.print("<a href='cookie.html'/>상품선택 페이지<br>");
		out.print("<a href='CartDeleteCookie'/>장바구니 비우기<br>");
		out.print("</body></html>");
	}

}
