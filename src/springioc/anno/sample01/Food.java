package springioc.anno.sample01;

public class Food {
	private String foodName;
	private String foodPrice;
	// 이 객체 인자를 받아서 의존성을 주입하는 걸 할거에요 
	public Food() {
		System.out.println("기본 생성자 호출");
	}

	public Food(String foodName, String foodPrice) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
		System.out.println("setFoodName() setter 호출!");
	}

	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
		System.out.println("setFoodPrice() setter 호출!");

	}
	@Override
	public String toString() {
		// 올바르게 담겨있는지 확인하려고 
		return foodName + "," + foodPrice;
	}
	
}
