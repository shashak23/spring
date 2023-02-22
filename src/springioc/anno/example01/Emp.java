package springioc.anno.example01;

// vo 역할
public class Emp {
	private String name;
	private String salary;
	
	public Emp() {
		
	}

	public Emp(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// 데이터가 들어가서 결과가 잘 나오는지 확인
		// 김베리 , 10,000,000 이렇게 나오도록 해야함
		return name + "," + salary;
	}
}
