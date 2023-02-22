package springioc.sample07;

public class Developer extends Emp {
	private String dept;
	
	public Developer() {
		
	}
	public Developer(String name, int salary, String dept) {
		super(name,salary);
		this.dept = dept;
	} 
	// 이렇게 만들어 놓고 객체를 만들어서 사용할겁니다?
	
}
