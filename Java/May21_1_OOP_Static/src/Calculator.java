import java.util.Scanner;

// 변수 왜 만드나요 ? : 데이터 저장하려고 => Memory상의 공간에!
// 		변수 : 데이터를 저장하는 공간(그릇)

// 그렇다면 객체는 왜 만드나요 ? : 실행활스러운 변수(속성)을 만들어서 알아보기 편하게 하기 위해서
// 			=> static 없는 method 가지고 오려고


public class Calculator {
	// 선생님의 판단 : 멤버변수가 필요없음 => 저장할게 없음
	// 		=> 그렇다면 굳이 계산기 객체를 만들 필요가 없음
	// 		=> static 메소드 기반
	
//	Scanner sum = new Scanner(System.in);
//	int x;
//	int y;
	
	public static void Sum(int a, int b) {
		System.out.println(a + b );
	}
	public void Sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}





