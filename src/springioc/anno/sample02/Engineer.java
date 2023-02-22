package springioc.anno.sample02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
//	@Autowired // type가지고 찾을 때
//	@Qualifier(value="emp1")
	
	//위의 두가지가 합쳐진 것이 resource이다, 이름갖고 찾을 때
	@Resource(name="emp1")
	private Emp emp;
	@Autowired // setter가 있어야지 값을 넣어줄 수 있는데, 밑에 있는 my_dept 메소드때문에 
	private String dept;
	
	public Engineer () {
		
	}
	
	@Autowired   
	// Auto wired가 왜 여기에 붙나요? 
	// -> 얘도 자동주입인데 무얼? 
	// 일반 메소드에 대해 자동주입할 떄 뒤 쪽에 있는 dept라는 id를 찾아서 주입하는 것, dept라는 id가 있어야해
	public void my_dept(String dept) {
		this.dept = dept;
		System.out.println("일반 메소드에요!");
	}
}
