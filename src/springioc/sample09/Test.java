package springioc.sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml",DataBean.class);
		TestBean bean = context.getBean("myObj", TestBean.class);  // 내가 xml에서 만든 name = myObj
//		TestBean bean = (TestBean)context.containsBean("myObj") // 위와 같은 방식이지만 조금 덜 깔끔한 방시임
		
		System.out.println(bean.getData1());  // 이거하면 DataBean 의 data1가 나옴
		System.out.println(bean.getData2());  
		
 	}
}
