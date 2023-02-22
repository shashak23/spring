package springIoC_sample03;

public class UserServiceImpl implements UserService{
	
	// 원래는 필드가 있으면 안돼요~! 
	private User user; // stateless? = 무상태 프로토콜
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl 기본 생성자");
	}
	
	public UserServiceImpl(User user) {
		this.user = user;
		System.out.println("UserServiceImpl 생성자 호출 -" + user);
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl - addUser() 메소드 호출!");
	}
}
