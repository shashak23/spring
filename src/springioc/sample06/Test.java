package springioc.sample06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// ApplicationContext 생성
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml", Output.class);
		// bean을 들고 왔는데 
		MessageBean bean = context.getBean("myBean", MessageBean.class);
		
		bean.sayHello(); // 설정에 따라 bean을 다르게 출력할 수 있다
//		
//		MessageBean bean1 = context.getBean("myBeanConsole", MessageBean.class);
//		
//		// 설정에 따라 console 또는 file에 출력할 수 도 있음
//		bean1.sayHello();
		
		// 상위타입의 구현체로 작성해서 닫아줘야해요
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
