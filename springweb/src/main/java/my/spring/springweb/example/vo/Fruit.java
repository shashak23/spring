package my.spring.springweb.example.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fruit { // 데이터를 하지 않고 세터를 만들어요 
	private int apple;
	private int banana;
	private int orange;

}
