package springIoC_sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext", Bar.class);
		// 이렇게 하면 application context 만들어 지고 
		// 생성자 호출되기 
	}
}
