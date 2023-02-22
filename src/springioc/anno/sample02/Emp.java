package springioc.anno.sample02;

public class Emp {
	// vo 역할
	private String name;
	private int age;

	
	public Emp() {
		
	}

	public Emp(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		
	}
	// getter setter를 다 만드는 건 아니지만~
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + age;
	}
	
}
