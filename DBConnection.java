package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public Connection openDB(String URL, String USER, String PASSWORD) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC Connection Open!");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean 테이블생성(Connection conn, String sql) {
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();
			pstmt.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<DbTable> 데이터가져오기(Connection conn, String sql) {
		List<DbTable> list = new ArrayList<DbTable>();
		DbTable data;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				data = new DbTable();

				// 데이터를 매핑하시오.
				data.setNo(rs.getInt("no"));
				data.setName(rs.getString("name"));
				data.setEmail(rs.getString("Email"));
				data.setPwd(rs.getString("pwd"));
				data.setDel(rs.getBoolean("Del"));

				list.add(data);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean 데이터입력하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			// 데이터를 매핑하시오.
			
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getName());
			pstmt.setString(3, data.getEmail());
			pstmt.setString(4, data.getPwd());
			pstmt.setBoolean(5, data.isDel());
			

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean 데이터수정하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			// 데이터를 매핑하시오.
			pstmt.setString(1, data.getEmail());
			pstmt.setString(2, data.getPwd());
			pstmt.setInt(3, data.getNo());

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean 데이터삭제하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			// 데이터를 매핑하시오.
			pstmt.setBoolean(1, data.isDel());
			pstmt.setInt(2, data.getNo());

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
