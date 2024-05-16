import java.util.Random;
import java.util.Scanner;

public class FMain6 {
	
	// 랜덤한 정수를 '출력'하는 함수!
	public static int red(int a) {     // 기능만 있는 함수
		Random r = new Random();
		int i = r.nextInt();
		return i; // i에 있는 값을 최종결과로 리턴
				  // 이 함수는 종료
	}
	
	// 램덤한 정수를 '생성'하는 함수!
	public static int blue() {         // 결과값을 생성하는 함수
		Random r = new Random();
		int i = r.nextInt();
		return i;
		
	}
	
	// 정수를 하나 넣으면 홀수인지 짝수인지 출력하는 함수!
	public static void green(int a) {   // 뭔가를 넣어서 기능을 만드는 함수
		Scanner keyboard = new Scanner(System.in);
		System.out.println("입력 : ");
		String result = (a % 2 == 1) ? "홀" : "짝";
		System.out.printf("%d는 %s\n", a, result);
		System.out.println("--------------------");
	}
	
	// 정수를 두 개 넣었을 때,
	public static String purple(int a, int b) { //뭔가를 넣으면
		String result = (a > b) ? "앞" : "뒤";	//결과값을 생성하는 함수
		return result;
		
	}
	
	// 앞 숫자가 크면 '앞', 뒷 숫자가 크거나 같으면 '뒤' 생성하는 함수!

	public static void main(String[] args) { 	
	red(0);
	int i = blue();
	System.out.println(i);
	System.out.println("---------------");
	
	green(i);
	green(5);
	green(8);
	
	String ss = purple(20, 30);
	System.out.println(ss);
	System.out.println("---------------");
	// 저녁메뉴 (2가지 중 하나)
	int r1 =blue();
	int r2 =blue();
	
	
	String sss = purple(r1, r2);
	String menu = (sss.equals("앞")) ? "초밥" : "파스타";
	System.out.println(menu);
	// 위의 함수를 이용해서
	// 랜덤한 숫자 2개를 뽑아서
	// 먼저 뽑힌게 크면 '초밥', 아니면 '파스타' 를 출력
	}
	
}


