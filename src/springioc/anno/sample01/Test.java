package springioc.anno.sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml",Food.class);
	
	MyFoodManager obj = context.getBean("myFood",MyFoodManager.class);
	
	System.out.println(obj);
	
	((ClassPathXmlApplicationContext)context).close();
	//제대로 자동 주입이 되는지 확인할 수 있는 클래스

	}
}
