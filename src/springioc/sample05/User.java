package springioc.sample05;

public class User {
	private String name;
	private String birth;
	
	public User() {
		
	}

	public User(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ "μ μμΌμ :" + birth;
	}
}
