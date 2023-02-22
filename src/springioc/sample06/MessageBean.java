package springioc.sample06;

public interface MessageBean {
	// 이 구현체를 구현한 하나의 인터페이스 
	// message bean이 가진 특정 메소드가 있는데
	void sayHello(); // override할 애, 특정 구현체를 통해 구현됨
	//실제 사용할 bean 클래서 만들기! --> MessageBeanImpl
}
