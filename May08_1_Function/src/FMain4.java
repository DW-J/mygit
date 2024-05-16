import java.util.Random;
import java.util.Scanner;

public class FMain4 {
	// 동전 맞추기 게임
	// 10개
	
	
	// 동전 10개 섞기
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1; //1개 에서 10개 까지
//		return coin;
		return new Random().nextInt(10) + 1; // 한줄로 줄이면 이렇게 됨
	}
	
	// 질문 & 답 입력
	public static int askUserAns() {
//		Scanner keyboard = new Scanner(System.in);
		System.out.println("동전 개수는? : ");
//		int userAns = keyboard.nextInt();
//		return userAns;
		return new Scanner(System.in).nextInt();
			
		}
		
	// 답 비교하기
	public static String getResult(int coin, int userAns) {
//		String result = (coin == userAns) ? "정답" : "땡";
//		return result;
		return (coin == userAns) ? "정답" : "땡";
		}
	
	// 결과 출력
	public static void printResult (int coin, int userAns, String result) {
		System.out.printf("동전 개수는 : %d개\n", coin);
		System.out.printf("당신의 답은 : %d개\n", userAns);
		System.out.println(result);
	}
	/*
	public static void start () {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
	}
	*/	
	public static void main(String[] args) {
//		start();
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
	}
}
