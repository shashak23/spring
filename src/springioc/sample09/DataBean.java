package springioc.sample09;


public class DataBean {
	private String name;
	
	public DataBean() {
		System.out.println("DataBean 기본 생성자 호출");
	}

	public DataBean(String name) {
		super();
		this.name = name;
		System.out.println("DataBean name이라는 인자를 받아들이는 생성자 호출" + name);

	}

	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
