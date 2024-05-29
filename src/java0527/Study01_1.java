package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Study01_1 {
	
	String driver = "org.mariadb.jdbc.Driver";
	String 주소 = "jdbc:mariadb://localhost:3306/edu";
	// jdbc    :oracle:thin:  @//[HOST]  [:PORT]  /SERVICE
	// jdbc -> 데이터베이스타입 -> 호스트(IP) -> 포트 -> 데이터베이스명
	// 데이터베이스 접속
	String 사용자 = "root";
	String 비밀번호 = "02135";
	
	public void 접속() {
		System.out.println("접속 시작");
		
		try {
//			start
			Class.forName(driver); // 클래스 확인
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호); // 데이터베이스 접근
//			---
			
			String sql1 = "create OR REPLACE table test (no int, name varchar(50))"; // varchar(길이)
			
			PreparedStatement ps = conn.prepareStatement(sql1); // 반복코드 재사용 가능
			ps.execute(); // 테이블 생성 메소드
		
//          DML Insert
			String sql2 = "insert into test (no, name) value (1, '하이')";
			
			ps = conn.prepareStatement(sql2);
			int result = ps.executeUpdate();
			System.out.println(result);
//			---
			
//          sql = select문 실행해서 위의 insert된 데이터를 출력 하시오!
			
			String sql3 = "select * from test";
			
			ps = conn.prepareStatement(sql3);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				Study01Dto testDto = new Study01Dto();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				
//				System.out.println(no + ", " + name);
			}
//			---

//			수정
			String sql4 = "update test set name = '안녕'";
			
			ps = conn.prepareStatement(sql4);
			result = ps.executeUpdate();
			System.out.println(result);
			
//			데이터 확인
			ps = conn.prepareStatement(sql3);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				Study01Dto testDto = new Study01Dto();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
			}
			
//			삭제
			String sql5 = "delete from test";
			
			ps = conn.prepareStatement(sql5);
			result = ps.executeUpdate();
			System.out.println(result);
			
//			데이터 확인
			ps = conn.prepareStatement(sql3);
			rs = ps.executeQuery();
			int cnt = 0;
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				Study01Dto testDto = new Study01Dto();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
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
