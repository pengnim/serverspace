package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import mvc.command.NullHandler;
//ContuF 단점 : ?cml=hello
//보완 => controuf : 확장자 패턴 사용

public class ControllerUsingFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile");
		Properties prop = new Properties(); //Map계열
		String configFilePath = getServletContext().getRealPath(configFile);
	

		try(FileReader fis = new FileReader(configFilePath)){
			prop.load(fis);
		}catch(IOException e){
			throw new ServletException(e);
		}
		
		Iterator<Object> it = prop.keySet().iterator();
		while(it.hasNext()) {
			
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String command = req.getParameter("cmd");
		CommandHandler handler = commandHandlerMap.get(command);
		if(handler == null) {
			handler = new NullHandler();
		}
		String viewPage = null;
		try {
			viewPage = handler.process(req, resp); //"/WEB-INF/view/hello.jsp"
		}catch(Exception e) {
			throw new ServletException(e);
		}
		if(viewPage != null) {
			RequestDispatcher d = req.getRequestDispatcher(viewPage);
			d.forward(req, resp);
		}
	}
}
