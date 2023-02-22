package springioc.sample06;

public class ConsoleOutput implements Output{
	// console에 찍는애라 별로 할 게 없어요
	
	public ConsoleOutput() {
		System.out.println("ConsoleOutput default 생성자 호출");
	}
 	
	@Override
	public void print(String message) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	// output을 통해서 대체 가능한 전략 패턴을 2가지로 만든 겁니다
}
