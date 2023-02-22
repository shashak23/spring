package springioc.sample06;

public interface Output {
	// 구현체가 override를 하는 클래스이다
	// 자기 타겟에 맞게 출력을 해주는 게 interface 안에 있고
	// 그게 override가 되어야지 연결이 되겠쥬?
	void print(String message) throws Exception;
	//r print라는 메소드를 하면 db를 찍을 수 있어요 console 이든 뭐든
	
}
