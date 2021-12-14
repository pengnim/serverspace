package study09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/study/study09/CartSaveCookie")
public class CartSaveCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		String product = req.getParameter("product");
		Cookie[] cookies = req.getCookies();
		Cookie c = null;
		if(cookies == null || cookies.length == 0) {
			
			c = new Cookie("product", product);
			
		}else {
			c = new Cookie("product" + (cookies.length+1) , product);
		}
		
		resp.addCookie(c);
		
		out.print("<html><body>Product추가<br>");
		out.print("<a href='CartBasketCookie'/>장바구니보기");		
		out.print("</body></html>");
	}

}
