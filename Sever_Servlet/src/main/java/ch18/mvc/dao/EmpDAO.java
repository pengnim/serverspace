package ch18.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch17_servlet.JdbcUtil;
import ch18.mvc.vo.EmpDTO;

public class EmpDAO {
	private Connection con = null;
	public EmpDAO() {
		con = JdbcUtil.getConnection();
	}

	public ArrayList<EmpDTO> select() {
		String sql = "SELECT * FROM emp05";
	
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> dtoSet = new ArrayList<>();
		
		try {

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

		} catch (SQLException e) {

		} finally {

			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return dtoSet;
	}

}
