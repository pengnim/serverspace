package command_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import command_pattern.EmpDTO;

public class EmpDAO {
	
	DataSource dataFactory;
	
	public EmpDAO() {
		
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/emp05");
		} catch (NamingException e) {
			//.l TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<EmpDTO> select() throws SQLException {
		String sql = "SELECT * FROM emp05";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> dtoSet = new ArrayList<>();
		
		try {
			con = dataFactory.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setSal(rs.getInt(3));
				dto.setDno(rs.getInt(4));
				
				dtoSet.add(dto);
			}

		} finally {

			pstmt.close();
			rs.close();
		}
		return dtoSet;
	}

}
