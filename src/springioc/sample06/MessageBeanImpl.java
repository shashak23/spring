package springioc.sample06;

public class MessageBeanImpl implements MessageBean {
	// 해당 인터페이스를 구현할 구현체라는 클래스
	private String name; //생성자로 받기
	private String phone; //setter 사용
	private Output output; //setter 사용
	
	public MessageBeanImpl() {
		System.out.println("MessageBeanImpl 기본 생성자 호출");
	}
	
	public MessageBeanImpl(String name) {
		this.name = name;
		System.out.println("MessageBeanImpl 생성자 호출" + name);
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("setPhone() setter 호출 ");

	}

	public void setOutput(Output output) {
		this.output = output;
		System.out.println("setOutput() setter 호출 ");

	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		String msg = name + " : " + phone;
		System.out.println("@@ name:" + name + ", phone:" + phone);
		
		// 출력할거야 output 객체 이용
		// 동적바인딩이 일어나요
		try {
			output.print(msg);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		// output이 상위인데 이걸 가져와서 동적바인딩이라서 가져와졌고...
		// output의 구현체가 어떤거냐에 따라 console이나 다른 걸로 출력할 수 있어요 
	}
}
