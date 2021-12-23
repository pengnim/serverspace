package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class HelloHandler implements CommandHandler{

	public String process(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("hello", "안녕하세요");
		return "/WEB-INF/view/hello.jsp";
	}

}
