package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {
	
	String driver = "org.mariadb.jdbc.Driver";
	String 주소 = "jdbc:mariadb://localhost:3306/edu";
	String 사용자 = "root";
	String 비밀번호 = "02135";
	
	public void 시작() {
		System.out.println("접속 시작");
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			String sql01 = "create OR REPLACE table onepice (no int, name varchar(12), gender varchar(4), ability varchar(15), groupname varchar(10), role varchar(10))";
			
			PreparedStatement ps = conn.prepareStatement(sql01);
			ps.execute();
			
//			Insert
			String sql1 = "insert into onepice (no, name, gender, ability, groupname, role) value (1, '몽키 D 루피', '남자', '고무고무 열매', '밀짚모자', '선장')";
			String sql2 = "insert into onepice (no, name, gender, ability, groupname, role) value (2, '롤로노아 조로', '남자', '삼도류', '밀짚모자', '부선장')";
			String sql3 = "insert into onepice (no, name, gender, ability, groupname, role) value (3, '상디', '남자', '요리사', '밀짚모자', '요리사')";
			String sql4 = "insert into onepice (no, name, gender, ability, groupname, role) value (4, '나미', '여자', '항해사', '밀짚모자', '항해사')";
			String sql5 = "insert into onepice (no, name, gender, ability, groupname, role) value (5, '우솝', '남자', '사격', '밀짚모자', '저격수')";
			String sql6 = "insert into onepice (no, name, gender, ability, groupname, role) value (6, '토니토니 쵸파', '미정', '사람사람 열매', '밀짚모자', '의사')";
			String sql7 = "insert into onepice (no, name, gender, ability, groupname, role) value (7, '니코 로빈', '여자', '꽃꽃 열매', '밀짚모자', '고고학자')";
			String sql8 = "insert into onepice (no, name, gender, ability, groupname, role) value (8, '프랑키', '남자', '사이보그', '밀짚모자', '조선공')";
			String sql9 = "insert into onepice (no, name, gender, ability, groupname, role) value (9, '브룩', '남자', '연주자', '밀짚모자', '선원')";
			String sql10 = "insert into onepice (no, name, gender, ability, groupname, role) value (10, '버기', '남자', '동강동강 열매', '버기', '선장')";
			
			ps = conn.prepareStatement(sql1);
			int result = ps.executeUpdate();

			ps = conn.prepareStatement(sql2);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql3);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql4);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql5);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql6);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql7);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql8);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql9);
			result = ps.executeUpdate();
			
			ps = conn.prepareStatement(sql10);
			result = ps.executeUpdate();
			
//			---
			
//			select
			
			String sql02 = "select * from onepice";
			
			ps = conn.prepareStatement(sql02);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String ability = rs.getString("ability");
				String groupname = rs.getString("groupname");
				String role = rs.getString("role");
				Test01Dto test01_1 = new Test01Dto();
				test01_1.setNo(no);
				test01_1.setName(name);
				test01_1.setGender(gender);
				test01_1.setAbility(ability);
				test01_1.setGroupname(groupname);
				test01_1.setRole(role);
				

			}
			
//			수정
			
			String sql03 = "update onepice set role = '광대' where no = 10";
			
			ps = conn.prepareStatement(sql03);
			result = ps.executeUpdate();
//			---
			
//			데이터 확인
			ps = conn.prepareStatement(sql02);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String ability = rs.getString("ability");
				String groupname = rs.getString("groupname");
				String role = rs.getString("role");
				Test01Dto test01_1 = new Test01Dto();
				test01_1.setNo(no);
				test01_1.setName(name);
				test01_1.setGender(gender);
				test01_1.setAbility(ability);
				test01_1.setGroupname(groupname);
				test01_1.setRole(role);
				
//				System.out.println(no + ", " + name + ", " + gender + ", " + ability + ", " + groupname + ", " + role);
			}
			
//			삭제
			String sql04 = "delete from onepice where no = 10";
			
			ps = conn.prepareStatement(sql04);
			result = ps.executeUpdate();
			
//			데이터 확인
			ps = conn.prepareStatement(sql02);
			rs = ps.executeQuery();
			int cnt = 0;
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String ability = rs.getString("ability");
				String groupname = rs.getString("groupname");
				String role = rs.getString("role");
				Test01Dto test01_1 = new Test01Dto();
				test01_1.setNo(no);
				test01_1.setName(name);
				test01_1.setGender(gender);
				test01_1.setAbility(ability);
				test01_1.setGroupname(groupname);
				test01_1.setRole(role);
				
				System.out.println(no + ", " + name + ", " + gender + ", " + ability + ", " + groupname + ", " + role);
				cnt++;
			}
			
			
			
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
