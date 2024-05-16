import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	// 홀짝 게임 (함수.ver)
/*	
	// 홀짝게임 시작을 알리는 함수
	public static void startGame() {
		System.out.println("홀짝 게임 시작!");
	}
	
	// 질문하고 답입력하는 함수
	
	
	// 랜덤한 정수를 출력하는 함수
	public static int getNumber() {
		Random r = new Random();
		int number = r.nextInt();
		return number;
	}
	
	// 정수가 홀수인지 짝수인지 판별하는 함수
	public static String judgeNumber(int number) {
		String result = (number % 2 == 1) ? "홀" : "짝";
		return result;
	}
	
	// 결과를 출력하는 함수
	public static void printResult(int n, String r) {
		System.out.printf("나온 정수는 %d\n", n);
		System.out.println(r);
	}
	
*/	
	
	// 홀짝 게임 (함수.ver)
	// 랜덤한 동전 갯수 가져오기
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1; //1개 에서 10개 사이
//		return coin;
		return new Random().nextInt(10) + 1; // 한줄로 줄이면 이렇게 됨
		
	}
	
	// 질문 & 답 입력
	public static String askUserAns() {
//		Scanner k = new Scanner(System.in);
		System.out.println("홀? 짝? : ");
//		String userAns = k.next();
//		return userAns;
		return new Scanner(System.in).next();
		
	}
	
	// 동전 갯수가 홀수면 '홀', 짝수면 '짝'
	public static String getAnswer(int coin) {
//		String answer = (coin % 2 ==0) ? "짝" : "홀";
//		return answer;
		return (coin % 2 ==0) ? "짝" : "홀";
	}
	
	// 비교해서 결과 내기
	public static String getResult(String ua, String a) {
//		String result = (ua.equals(a)) ? "정답" : "땡";
//		return result;
		return (ua.equals(a)) ? "정답" : "땡";
	}
	
	// 출력
	public static void printResult(int coin, String ua, String a, String r) {
		System.out.printf("동전은 %d개 !\n", coin);
		System.out.printf("내가 입력한 답 : %s !\n", ua);
		System.out.printf("결과 : %s이라서 %s !\n",a ,r);
	}
	
	// 함수들 모으기
	public static void start() {
		int coin = shakeCoin();
		String userAns = askUserAns();
		String answer = getAnswer(coin);
		String result = getResult(userAns, answer);
		printResult(coin, userAns, answer, result);
	}
	
	public static void main(String[] args) {
		start();
	}
}
