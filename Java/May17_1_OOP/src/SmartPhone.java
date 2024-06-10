
public class SmartPhone {

	// 핸드폰
	// 모델명
	String model;
	// 제조사
	String company;
	// 가격
	int price;
	// 정보를 출력
	public void printInfo() {
		System.out.println(model);
		System.out.println(company);
		System.out.println(price);
	}
	
	// 전화가 왔을 때 - 벨소리 출력
	public void bellSound() {
		System.out.println("오버 더 호라이즌 ~ ~ ♪");
	}
}
