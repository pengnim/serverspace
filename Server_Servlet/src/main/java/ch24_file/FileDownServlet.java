package ch24_file;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDownServlet
 */
@WebServlet("/ch24_fileupload/FileDown")
public class FileDownServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String filename = request.getParameter("file_name");
		
		//업로드 한 곳에 있는 파일을 말함		
		String sDownloadPath = "C:\\Users\\pantaco\\Desktop\\DevSpace\\ServerSpace\\uploadtest\\";
		//파일의 최종 경로 : 파일이 있는 경로 + 파일이름
		String sFilePath = sDownloadPath + filename;

		byte[] files = new byte[4096];
		FileInputStream in = new FileInputStream(sFilePath);
		String sMimeType = getServletContext().getMimeType(sFilePath);
		System.out.println("ssMimeType>>>" + sMimeType);
		if (sMimeType == null)
			sMimeType = "application/octet-stream";
		response.setContentType(sMimeType);
		
		String sEncoding = new String(filename.getBytes("utf-8"));
		response.setHeader("Content-Disposition", "attachment; filename="+sEncoding);
	
		ServletOutputStream out  = response.getOutputStream();
	
		int numRead = 0;
		while((numRead = in.read(files, 0, files.length)) != -1) {
			out.write(files, 0, numRead);
		}
		
		//버퍼에 있는 내용 확실히 비우기
		out.flush();
		out.close();
		in.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
