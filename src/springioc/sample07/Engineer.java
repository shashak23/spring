package springioc.sample07;

public class Engineer {
	private Emp emp; // 굳이 상속을 받을 필요가 없어요
	private String dept;
	
	public Engineer() {
		
	}
	
	public Engineer(Emp emp, String dept) {
		
		this.emp = emp;
		this.dept = dept;
	}
	
	

}
