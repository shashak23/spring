package springioc.sample04;

import java.util.Calendar;
import java.util.GregorianCalendar;

// 추상 클래스
public abstract class AbstractDay {
	public abstract String dayInfo();
	
	public static AbstractDay getInstance() {
		// 우리 클래스에 대해서 static 메소드인 이것을 호출하면
		// AbstractDay의 객체가 나올 것이다!
		GregorianCalendar cal = new GregorianCalendar();
		// 그레고리 캘린더는 오늘 날짜에 대한 요일을 알아 낼 수 있다
		// 자바가 가진 api
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 해당 날짜에 대한 요일을 숫자로 알려줘요 --> 1 = 일요일, 2 = 월요일 ...이런식
		AbstractDay myday = null; // 리턴받기 위해 널을 하나 잡고
		switch(day) {
			case 1:
				//요일별 class를 만들고 extends를 해야 여기서 빨간줄이 없어져요
				myday=new Sunday();
				break;
			case 2:
				
				myday=new Monday();
				break;
			case 3:
				
				myday=new Tuesday();
				break;
		
		}//추상클래스로부터 객체를 만들었어요 - factory method를 이용해서!
		return myday;	// 이 추상클래스는 실제로 객체를 만들 수 있는 능력을 가진 메소드가 있어여
	}
}
