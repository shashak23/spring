package springioc.anno.example01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("myEmp")
public class Developer {
	
	@Autowired(required=false)
	private Emp emp;   // 형태를 emp로 필드명은 emp, 직원
	@Autowired
	private String dept;  // 형태를 emp로 필드명은 dept, 부서
	
	public Developer() {
		
	}
	
//	@Autowired // constructor에 넣어보기
	public Developer(@Autowired(required=false)Emp emp, String dept) {
		this.emp = emp;
		this.dept = dept;
		
	}
	
	

	@Override
	public String toString() {
		// 결과값이 아래와 같이 나와야한다. 근데 setter가 없으면 안될 것이다?
		// 이를 보완하기 위해 @Autowired(required=false)를 써야한다.
		return dept + " - " + emp;
	}

}
