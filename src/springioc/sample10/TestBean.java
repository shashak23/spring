package springioc.sample10;

public class TestBean {
	private DataBean data1;  //DataBean이라는 class를 필드로 받는 거 생성하자
	private DataBean data2;  //data1~2인 두 개를 들고 있자구
	
	public TestBean() {
		// TODO Auto-generated constructor stub
		System.out.println("TestBean의 dafault 생성자 호출");
	}
	
	public TestBean(DataBean data1, DataBean data2) {
//		super();
		this.data1 = data1;
		this.data2 = data2;
		System.out.println("TestBean의 인자가 있는 생성자 호출"); //출력이 안됨

	}
	
	// 각각에 대한 setter&getter만들기
	public DataBean getData1() {
		return data1;
	}


	public void setData1(DataBean data3) {
		this.data1 = data3;
	}


	public DataBean getData2() {
		return data2;
	}


	public void setData2(DataBean data2) {
		this.data2 = data2;
	}
	
	
}
