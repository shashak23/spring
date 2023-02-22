package springioc.sample06;

import java.io.FileWriter;

public class FileOutput implements Output {
	
	private String filePath;
	// bean이 제대로 동작하는지 확인하기 위해서
	public FileOutput() {
		System.out.println("FileOutput의 기본 생성자 호출!");
	}
	
	public FileOutput(String filePath) {
		super();
		this.filePath = filePath;
		System.out.println("FileOutput 생성자 호출! - " + filePath);
		// 생성자에 문자열을 주입받아서 자기 코드에 세티을 해주는 것
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		System.out.println("FileOutput 세터 호출!");
	} // setter 하기 

	@Override
	// 실제 파일을 만들어서 출력 해 보겠어요 라는 구현체임
	public void print(String message) throws Exception {
		// servlet에서 했던 writer stream 열기 
		FileWriter out = new FileWriter(filePath);
		
		out.write(message);
		System.out.println("@@@ message = " + message);
		
		out.flush(); // 원래는 버퍼에다가 저장을 하는데 이게 큰 일이라서 소스코드가 점점 많아질 떄 매번 열고 닫고를 하지 않아서 이 메소드를 주로 쓴다.
		out.close(); // close를 해야 닫는 순간에 text를 보낸다.
		
		//스트림 받아주기
		System.out.println("FileOutput 객체의 프린트 메소드 호출");
	};
}
