package testJdbc0530;

public class DbTable {
	
	private int no;
	private String email;
	private String password;
	private String delYn;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "DbTable [no=" + no + ", email=" + email + ", password=" + password + ", delYn=" + delYn + "]";
	}
	
	


}
