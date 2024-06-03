package testJdbc0529;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppController {
	
	private Scanner scan;
	private String name;
	private DBConnection db;
	private String sql;
	
	public AppController() {
		this.scan = new Scanner(System.in);
		this.db = new DBConnection();
	}

	/****************************************************************/
	// 1단계 테이블 생성하기
	private void 테이블생성(Connection conn) {
		sql =  "create OR REPLACE table "
				+ " study ("
				+ " 번호 		int,"
				+ " 이름 		varchar(50),"
				+ " 성별 		varchar(50),"
				+ " 특징 		varchar(50),"
				+ " 해적단 	varchar(50),"
				+ " 역할		varchar(50)"
				+ " )"; // DDL 추가
		System.out.println("테이블 생성 SQL문 확인 : " + sql);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.		
		db.테이블생성(conn, sql);
	}
	
	// 2단계 생성된 테이블에 데이터 입력하기
	private void 입력하기(Connection conn) {
		sql = "insert into study value (?, ?, ?, ?, ?, ?)"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		
//		data = new DbTable();
//		System.out.print("번호를 입력해주세요: ");
//		data.set번호(scan.nextInt());
//		scan.nextLine();
//		System.out.print("이름을 입력해주세요: ");
//		data.set이름(scan.nextLine());
//		System.out.print("성별을 입력해주세요: ");
//		data.set성별(scan.nextLine());
//		System.out.print("특징을 입력해주세요: ");
//		data.set특징(scan.nextLine());
//		System.out.print("해적단을 입력해주세요: ");
//		data.set해적단(scan.nextLine());
//		System.out.print("역할을 입력해주세요: ");
//		data.set역할(scan.nextLine());
		List<DbTable> list = 데이터생성();
		System.out.print("행의 개수를 입력하세요: ");
		int 행 = scan.nextInt();
		for (int i = 0; i < 행; i++) {

			System.out.print("출력 할 번호를 입력하세요(행의 개수" + 행 + "): ");
			data = list.get(scan.nextInt()-1);
			scan.nextLine();
		
		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터입력하기(conn, sql, data);
		}
	}
	
	private List 데이터생성() {
		List<DbTable> list = new ArrayList();
		DbTable data = new DbTable();
		data.set번호(1);
		data.set이름("몽키 D 루피");
		data.set성별("남자");
		data.set특징("고무고무 열매");
		data.set해적단("밀짚모자");
		data.set역할("선장");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(2);
		data.set이름("롤로노아 조로");
		data.set성별("남자");
		data.set특징("삼도류");
		data.set해적단("밀짚모자");
		data.set역할("부선장");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(3);
		data.set이름("상디");
		data.set성별("남자");
		data.set특징("요리사");
		data.set해적단("밀짚모자");
		data.set역할("요리사");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(4);
		data.set이름("나미");
		data.set성별("여자");
		data.set특징("항해사");
		data.set해적단("밀짚모자");
		data.set역할("항해사");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(5);
		data.set이름("우솝");
		data.set성별("남자");
		data.set특징("사격");
		data.set해적단("밀짚모자");
		data.set역할("저격수");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(6);
		data.set이름("토니토니 쵸파");
		data.set성별("미정");
		data.set특징("사람사람 열매");
		data.set해적단("밀짚모자");
		data.set역할("의사");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(7);
		data.set이름("니코 로빈");
		data.set성별("여자");
		data.set특징("꽃꽃 열매");
		data.set해적단("밀짚모자");
		data.set역할("고고학자");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(8);
		data.set이름("프랑키");
		data.set성별("남자");
		data.set특징("사이보그");
		data.set해적단("밀짚모자");
		data.set역할("조선공");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(9);
		data.set이름("브룩");
		data.set성별("남자");
		data.set특징("연주자");
		data.set해적단("밀짚모자");
		data.set역할("선원");
		list.add(data); // 리스트에 추가
		
		data = new DbTable();
		data.set번호(10);
		data.set이름("버기");
		data.set성별("남자");
		data.set특징("동강동강 열매");
		data.set해적단("버기");
		data.set역할("선장");
		list.add(data); // 리스트에 추가
		
		return list;
	}
	
	// 3단계 생성된 데이터 가져오기 >> 목록 출력 시 화면출력() 메소드를 사용하시오.
	private void 가져오기(Connection conn) {
		sql = "select * from study"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		화면출력(db.데이터가져오기(conn, sql));
	}
	
	// 4단계 생성된 데이터 수정하기
	private void 수정하기(Connection conn) {
		sql = "update study set 역할 = ? where 번호 = ?"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		data.set역할("광대");
		data.set번호(10);
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터수정하기(conn, sql, data);
	}
	
	// 5단계 생성된 데이터 삭제하기
	private void 삭제하기(Connection conn) {
		sql = "delete from study where 번호 = ?"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();

		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		data.set번호(10);

		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터삭제하기(conn, sql, data);
	}
	/****************************************************************/
	
	private void 사용자() {
		System.out.println("당신은 누구인가요?");
		this.name = scan.nextLine();
		System.out.println(this.name + "님 환영합니다.");
	}
	
	private void 종료() {
		System.out.println(this.name + "님 다음에 또 찾아주세요.");
		scan.close();
	}
	
	private void 화면출력(List<DbTable> list) {
		for(int i = 0; i < list.size(); i++) {
			DbTable data = list.get(i);
			System.out.println(data);
		}
	}
	
	private boolean 디비접속() {
		boolean result = false;
		boolean key = true;

		while(key) {
			System.out.println("데이터베이스에 연결하시겠습니까?(Y/N)");
			switch (scan.nextLine()) {
				case "Y":
				case "y":
					result = true;
				case "N":
				case "n":
					key = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
		return result;
	}
	
	public void 시작(String URL, String USER, String PASSWORD) {
		사용자();
		if(디비접속()) {
			try {
				Connection conn = db.openDB(URL, USER, PASSWORD);
				if(conn != null) {
					테이블생성(conn); // 개별로 사용하기 위해 void 사용
					boolean key = true;
					while(key) {
						System.out.println("어떤 기능을 실행하시겠습니까?(C입력/R읽기/U수정/D삭제/E종료");
						switch (scan.nextLine()) {
							case "C":
							case "c":
								입력하기(conn);
								break;
							case "R":
							case "r":
								가져오기(conn);
								break;
							case "U":
							case "u":
								수정하기(conn);
								break;
							case "D":
							case "d":
								삭제하기(conn);
								break;
							case "E":
							case "e":
								key = false;
								break;
							default:
								System.out.println("잘못된 입력입니다. 다시 기능을 입력해주세요.");
						}
					}
					conn.close();
					종료();
				} else {
					System.out.println("데이터 접속 정보를 확인해 주세요.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			종료();
		}
	}

}