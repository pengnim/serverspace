package ch24_file;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


//1024*1024*2 = 2MB
@WebServlet("/ch24_fileupload/Upload")

//maxFileSize : 한번에 올릴 수 있는 최대 크기, location : 파일이 업로드 되는 경로
@MultipartConfig(maxFileSize = 1024*1024*2, location = "C:\\Users\\pantaco\\Desktop\\DevSpace\\ServerSpace\\uploadtest")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//업로드한 파일명을 얻기
	private String getFileName(Part part) {
		String filename = null;
		String contentDispositionHeader = part.getHeader("Content-Disposition");
		System.out.println(contentDispositionHeader);
		String[] elements = contentDispositionHeader.split(";");
		for(String s : elements) {
			if(s.trim().startsWith("filename")) {
				filename = s.substring(s.indexOf("\"")+1, s.length()-1);
				filename = filename.trim().replace("\\", "");
				
			}
		}
		return filename;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Part part = request.getPart("theFile");
		String fn = getFileName(part);
		
		//파일이 존재한다면 location경로에 파일 쓰기
		if(fn != null && !fn.isEmpty()) {
			part.write(fn);
		}
		
		String author = request.getParameter("theAuthor");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("작성자 : " + author+"<br>");
		out.println("파일명 : <a href='FileDown?file_name=" + fn +"'>"+fn+"</a><br>");
		out.println("파일의 크기 : " + part.getSize() +"<br>");
		
		
		
	}

}
