package my.spring.springweb.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import my.spring.springweb.example.vo.Fruit;
import my.spring.springweb.sample06.LottoService;
import my.spring.springweb.sample06.vo.Lotto;


@Controller
@SessionAttributes({"data1", "fruit"})
@RequestMapping(value="/basketController") 
public class BasketController {
	
	Logger log = LogManager.getLogger("case3");

	@GetMapping
	public String myMethod() {
		log.debug("GET 실행되었지롱~");
		// choice로 처음 들어가고 버튼 누르고 2번 나옴 
		return "example/Choice";
	}
	
	@ModelAttribute("fruit")
	public Fruit myMethod2() {
		Fruit fruit = new Fruit();
		return fruit;
	}
	
	// 장바구니 비우기
	// 장바구니 비우려면  세션을 제거해줘야 해요
	// 세션을 지우려면 우리가 SessonStatus sessionStatus를 이용해서 session을 Control 해줄 수 있어요
	// sessionStatus.setComplete();
	// 이걸 하면 세션이 사라져요!
	@GetMapping("basketEmpty")
	public String Basket(@ModelAttribute("basket") Fruit fruit,
				SessionStatus sessionStatus) {
		 sessionStatus.setComplete();
		 log.debug("장바구니 비어졌음");
		return "redirect:/basketController"; //선택화면이 아닌 컨트롤러로...servlet을 보내주는 것 같고
//		 return "redirect:example/Choice";
	}
	// 과일 별로 카운트 하나씩 되기 
	@GetMapping("basketCount")
	public String BasketCount(@ModelAttribute("fruit") Fruit fruit,@RequestParam("basketNum") int basketNum ) {
		
		log.debug("들어온 값 = {}",basketNum);
		if(basketNum == 1) {
			// 사과 증가
			fruit.setApple(fruit.getApple()+1);
			log.debug("사과 계산 됐음", fruit);
		} else if(basketNum == 2) { // 2인 조건
			fruit.setBanana((fruit.getBanana()+1));
			log.debug("바나나 계산 됐음", fruit);
		} else  { //1과 2가 아닌 조건
			fruit.setOrange(fruit.getOrange()+1);
			log.debug("오렌지 계산 됐음", fruit);

		}
		
		return "example/Basket"; // jsp바로
	}
}
