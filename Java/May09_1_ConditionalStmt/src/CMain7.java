import java.util.Scanner;

public class CMain7 {
	
	// f1 : 정수를 하나 입력 받아서
	// 그게 양수면 "양" / 0이면 "0" / 음수면 "음" 출력
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int i = k.nextInt();
		
		if (i > 0) {
			System.out.println("양");
		} else if (i == 0){
			System.out.println("0");
		} else {
			System.out.println("음");
		}
		
		
	}
	
	// f2 : 정수를 하나 입력받아서
	// 3의 배수면 "3의 배수"
	// 4의 배수면 "4의 배수"
	// 공배수면 "공배수"
	// 둘 다 아니면 "몰라!!!"
	// 를 판정해주는 함수
	
	public static String f2() {
		Scanner k = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int x = k.nextInt();
		
		if (x % 12 == 0){
			return "3의 배수 + 4의 배수";
		} else if (x % 3 == 0) {
			return "3의 배수";
		} else if (x % 4 == 0){
			return "4의 배수";
		} 
		return "몰라!!!";
	}
		
	
	
	public static void main(String[] args) {
		f1();
		System.out.println("===============");
		f2();
		
		
		
//	} else if((f2 % 3 == 0) && (f2 % 4 == 0)) {
//		System.out.println("공배수");
	}
}
