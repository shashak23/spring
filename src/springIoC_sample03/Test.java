package springIoC_sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// application context 객체를 생성 = bean factory 만들기 = ioc 만들기
		// 외워야해요
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml", User.class);
		
		UserService service = context.getBean("userService", UserService.class); // 나는 ""이름으로 bean을 만들겠따
		
		User user = context.getBean("obj1", User.class);
	
		service.addUser(user); 
		
		((ClassPathXmlApplicationContext)context).close(); // 해제하기
	}
}
