package springioc.anno.example01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml",Emp.class);
	
		Developer obj = context.getBean("myEmp",Developer.class);
	
	System.out.println(obj);
	
	((ClassPathXmlApplicationContext)context).close();
	}
}
