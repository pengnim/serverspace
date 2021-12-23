package command_pattern;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectService {
	public ArrayList<EmpDTO> execute(HttpServletRequest request, HttpServletResponse response) throws SQLException{
		EmpDAO dao = new EmpDAO();
		return dao.select();
	}
}
