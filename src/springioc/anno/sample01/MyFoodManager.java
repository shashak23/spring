package springioc.anno.sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myFood") // 기본 bean id : myFoodManager
public class MyFoodManager {
	
	// 필드를 2개 잡을거에요
	@Autowired
	@Qualifier(value="unfavoriteFood") 
	// 빈의 이름을 명시할 수 있는데, 이 필드에 자동주입을 하는데, type이 아니라 name을 보고 찾아라
	private Food favoriteFood;

	@Autowired   // 비록 타입이 똑같지만 id가 존재하기때문에 자동적으로 주입을 시켜줍니다
	private Food unfavoriteFood;
	
	public MyFoodManager() {
		System.out.println("기본 생성자 호출");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return favoriteFood + "," + unfavoriteFood;
	}
}
