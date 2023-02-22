package springioc.sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml", Monday.class);
	}
} // 이게 결국에는 출력이 안돼요. - why? 추상이어서 <-> 그치만 객체를 뽑아낼 수 있는 메소드는 가지고 있다.
