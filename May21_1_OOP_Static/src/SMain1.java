
// 1. 기계어 상태의 소스가 stack영역에 깔림
// 2. static 멤버 변수들이 static영역에 배치
// 3. JVM이 SMain1.main(...);을 호출
// 4. 실행
public class SMain1 {
	
	public static void main(String[] args) {
		// 과자 객체를 만들어보자! + 출력 기능
		// 과자 이름, 중량, 가격

//		Snack s = new Snack();
//		
//		s.name = "새우깡";
//		s.size = 160;
//		s.price = 1500;
//		
//		s.snackInfo();
		
		// 지금 main에는 과자가 없는 상태
		// 과자 이름? => 모름
		// 과자 무게? => 모름
		// 과자 가격? => 모름
		// 과자 생산자? => 정비오
//		System.out.println(Snack.manufactuerer);
		System.out.println(Snack.MANUFACTURER);
		System.out.println("-----------------");
		
		Snack.printTaste();
		
		// 과자 객체 2개 만들기
		Snack s1 = new Snack();
		s1.name = "꼬북칩";
		s1.size = 150;
		s1.price = 1650;
		s1.snackInfo();
		
		Snack s2 = new Snack();
		s2.name = "치킨너겟";
		s2.size = 270;
		s2.price = 2850;
		s2.snackInfo();
		
		// 일단 생산자는 다 김비버가 맞음
		// 생산자의 값을 바꿔보자
//		s2.manufactuerer = "J.D";
//		s2.snackInfo();
		
		// 다시 생산자의 값을 바꿔보자
//		s2.MANUFACTURER = "J.D";
		
		
		
		
	}
}














