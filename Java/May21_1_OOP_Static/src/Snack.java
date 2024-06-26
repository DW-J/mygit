
// 멤버변수 : 객체의 속성 => (객체.속성 으로 표현)
//						 this : 이 객체를 뜻함(생략 가능)

// 이 세상의 존재하는 모든 과자를 정비오씨가 만든다고 하면?
// 		이 때 사용하는게 *** static 멤버변수 !
//			- 객체가 없어도 쓸 수 있는 정보
//				=> 클래스명.xxx로 사용
// 			- 객체들의 공통속성
// 				=> 객체를 여러개 찍어내도 static 멤버변수는 하나만!
//				=> 메모리를 절약할 수 있다.
//			- Static 영역의 데이터는 프로그램의 시작부터 종료가 될 때까지
//				메모리에 남아있게 됨
//			- 무분별하게 많이 사용하다보면 메모리가 부족해질 수도 있음

// static 'final' 멤버변수
//		final을 쓰면 수정불가! => 상수화 (값을 변경하지 않겠다!)
//		static final 자료형 변수명(대문자로 / 문화임) = 내용;

// static 메소드
// 		메모리가 절약됨
//		객체가 없어도 사용가능하다
//			static이 아닌 멤버변수에는 접근 불가함


public class Snack {

	String name;
	double size;
	int price;
	
//	static String manufacturer = "정비오";
	static final String MANUFACTURER = "정비오";
	
	public void snackInfo() {
		System.out.printf("제품명 : %s\n", this.name);
		System.out.printf("중량 : %.1fg\n", size);
		System.out.printf("가격 : %d원\n", this.price);
//		System.out.printf("생산자 : %s\n", manufacturer);
		System.out.printf("생산자 : %s\n", MANUFACTURER);
		System.out.println("--------------------------");
	}
	
	public static void printTaste() {
		System.out.println(MANUFACTURER);
//		System.out.println(name);
//		System.out.println(price);  // => static이 아닌 멤버변수라서 에러!
		System.out.println("캬 ~ JMT !");
		System.out.println("-------------------");
	}
	
	
	
	
	
}

















