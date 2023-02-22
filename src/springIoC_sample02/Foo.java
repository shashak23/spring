package springIoC_sample02;

public class Foo {
	public Foo() {
		System.out.println("Foo의 기본 생성자 호출!");
	}
	public Foo(String str) {
		System.out.println("Foo의 생성자 호출 -" + str);
	}
	public Foo(String str, int num) {
		System.out.println("Foo의 생성자 호출 -" + str + "," + num);
		//빈객체 만들 때 이렇게 인자 넣어서 만들 수 있구나
	}
	public Foo(Bar bar) {
		System.out.println("Foo의 생성자 호출 -" + bar);
	} 
	// 값을 넣는 것도 인잭션이지만 의존성을 주입하는 걸 인잭션이라도 하는 것이기도 해요
	// foo라는 클래스는 bar라는 클래스에 의존하고 있고
	// bar가 있어야 foo가 의미가 있다.
	// bar라는 인스턴스가 foo가 되어야 하고 이런 xml로 표현하냐의 차이...

}
