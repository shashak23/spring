package springIoC_sample03;
//vo 역할
public class User {
	private String userName;
	
	public User() {
		System.out.println("user의 기본 생성자 호출!");
	}

	public User(String userName) { // userName인자를 가지는 생성자 만들기
		super();
		this.userName = userName;
		System.out.println("user의 생성자 호출 -" + userName);
	}
	// vo는 getter , setter 만드는 게 중요한데
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
