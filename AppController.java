package testJdbc0530;

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
		sql = "create OR REPLACE table "
				+ " study1 ("
				+ " no 				int,"
				+ " email 			varchar(50),"
				+ " password 		varchar(50),"
				+ " delYn 			boolean"
				+ " )"; // DDL 추가
	System.out.println("테이블 생성 SQL문 확인 : " + sql);
	// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.		
	db.테이블생성(conn, sql);
	
	
	sql = "insert into study1 value (?, ?, ?, ?)"; // DML 추가
	System.out.println("SQL문 확인 : " + sql);
	DbTable data = new DbTable();
	/*****************************************
	 *  Scanner 사용시 추가
	 *****************************************/
	List<DbTable> list = 데이터생성();
	System.out.print("행의 개수를 입력하세요: ");
	int 행 = scan.nextInt();
	scan.nextLine(); // 마지막에 추가
		for(int i = 0; i < 행; i++) {
			System.out.println("출력 할 번호를 입력하세요(행의 개수" + 행 + "): ");
			data = list.get(scan.nextInt()-1);
			scan.nextLine();
			// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
			db.데이터입력하기(conn, sql, data);
			System.out.println(data);
				
			}
	}
	
	// 2단계 생성된 테이블에 데이터 입력하기
	private void 입력하기(Connection conn) {
		sql = "insert into study1 value (?, ?, ?, ?)"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		
		
		data = new DbTable();
		data.setNo(5);
		System.out.print("추가 할 Email을 입력하세요: ");
		data.setEmail(scan.nextLine());
		System.out.print("추가 할 Password를 입력하세요: ");
		data.setPassword(scan.nextLine());
		System.out.println("삭제여부 (Y, N)");
		data.setDelYn(scan.nextLine());
		
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터입력하기(conn, sql, data);
		System.out.println(data);
			
				
		
	}
	
	private List 데이터생성() {
		List<DbTable> list = new ArrayList();
		DbTable data = new DbTable();
		data.setNo(1);
		data.setEmail("홍길동@이메일.컴");
		data.setPassword("pAssWorD");
		data.setDelYn("N");
		list.add(data);
		
		data = new DbTable();
		data.setNo(2);
		data.setEmail("유관순@이메일.컴");
		data.setPassword("1@34%");
		data.setDelYn("Y");
		list.add(data);
		
		data = new DbTable();
		data.setNo(3);
		data.setEmail("이순신@이메일.컴");
		data.setPassword("!!9!2#");
		data.setDelYn("Y");
		list.add(data);
		
		data = new DbTable();
		data.setNo(4);
		data.setEmail("화이슬@이메일.컴");
		data.setPassword("hiDe");
		data.setDelYn("N");
		list.add(data);
		
		return list;
		
	}
	
	// 3단계 생성된 데이터 가져오기 >> 목록 출력 시 화면출력() 메소드를 사용하시오.
	private void 가져오기(Connection conn) {
		sql = "select * from study1"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		화면출력(db.데이터가져오기(conn, sql));
	}
	
	// 4단계 생성된 데이터 수정하기
	private void 수정하기(Connection conn) {
		sql = "update study1 set email = ?, password = ? where no = ? "; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		data.setEmail("신총맨@이메일.컴");
		data.setPassword("tlschsaos");
		data.setNo(4);
		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터수정하기(conn, sql, data);
	}
	
	// 5단계 생성된 데이터 삭제하기
	private void 삭제하기(Connection conn) {
		sql = "update study1 set delYn = false where no = ?"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();

		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		data.setNo(5);

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
					테이블생성(conn);					
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