// 생성자 (Java)
//	1. 클래스에 생성자가 하나도 없으면
//		자바 컴파일러가 생성자를 만들어줌!
//	2. 하위클래스 객체를 만들면(Pen)
//		상위클래스 기본생성자(Product2)를 자동 호출

public class Pen extends Product2 {
	String color;
	public Pen() {
		// TODO Auto-generated constructor stub
		// 2. 가 발동
	}
	
	public Pen(String color) {
		// super(); // 2. 을 명시해놓은것 (super();는 없어도 무방 
//											= 알아서 불러올 것이기 때문)
		this.color = color;
	}

	public Pen(String name, int price, String color) {
		super(name, price); // 2. 발동 (x)
		// ㄴ얘는 생략 안됨		// Product2(이름, 가격)
		this.color = color;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(color);
	}
}
