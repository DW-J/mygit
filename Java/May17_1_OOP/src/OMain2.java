// Java : perfect 객체지향언어 (구조가)
// C++, Python : Hybrid 객체지향언어 (구조가)

// 샐생활을 묘사하자 => 보기가 쉬워질 것 => 유지보수에 용이해짐 !

// main()있는 클래스 : XXXMain
public class OMain2 {
	public static void main(String[] args) {
		// 버스를 Java로 표현해보자
		// => 표현하고 싶을 때는 항상! 클래스를! 새로! 만들자!
		// 버스번호 / 차종 / 버스회사 / 기사님이름 / 시작점 => 출력
		// int, double, String, ... : ?!?!, Java를 모르는 사람한테 설명하기 어렵다
		// 주석을 달 필요가 없다는데 장점!
		//		=> 뭘 표현하고자 하는지 알 수 있기 때문에!
		// b1 : 객체, instance 라고 부름
		
		Bus b1 = new Bus();		// 버스 한대가 완성
		b1.busNum = 43;
		b1.busBrand = "스카이버스";
		b1.busCompany = "금호트레블";
		b1.driverName = "박기사";
		b1.startLocation = "김포공항";
//		System.out.println(b1.busNum);
//		System.out.println(b1.busBrand);
//		System.out.println(b1.busCompany);
//		System.out.println(b1.driverName);
//		System.out.println(b1.startLocation);
		
		b1.printInfo();
		b1.go();
		System.out.println("----------------");
		
		// 핸드폰
		//		모델명
		//		제조사
		//		가격
		//		정보를 출력
		//		전화가 왔을 때 - 벨소리 출력
		
		SmartPhone s1 = new SmartPhone();
		System.out.println(s1); // 기본형이 아닌 것들은 다 참조형
		
		s1.printInfo(); // 각 자료형들의 기본값
		System.out.println("----------------");
		s1.model = "sn123321";
		s1.company = "Samsung";
		s1.price = 1000000;
		s1.printInfo();
		s1.bellSound();
		System.out.println("----------------");
		//1. s1과 똑같은 속성값을 가진 s2 생성 - 불가능!!! (53번줄의 방법으로는)
		//6. => 무조건 new ~~ 로 생성해야 !!!!!(*결론)
		SmartPhone s2 = s1; //2. s1 의 별명이 하나 더 추가된 상황!
		System.out.println(s2); //3. 번지값이 같다
								//4. 핸드폰 하나를 2명이 공유하고 있는 상황!
		s2.price = 850000;
		s2.printInfo();
		System.out.println("----------------");
		s1.printInfo(); //5. 위에서 s2 가격을 850000으로 변경 => 's2 = s1'이라 공유
		System.out.println("----------------");
		
		
		
	}
}









