package java0527;

public class Study01Dto { // DTO = 데이터를 전달하기 위한 객체
	
	private int no;
	private String name;
	
	public int getNo() { // 객체 담기
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() { // 객체 담기
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TestDTO [no=" + no + ", name=" + name + "]";
	}
	
	
	

}
