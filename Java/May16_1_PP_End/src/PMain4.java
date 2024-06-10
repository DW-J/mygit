import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// 가위바위보 게임 (함수 사용0)
// 	1. 가위 => 콘솔창에 1을 입력하면 가위
// 	2. 바위 => 콘솔창에 2를 입력하면 바위
// 	3. 보  => 콘솔창에 3을 입력하면 보
// 컴퓨터와 가위바위보를 해서 1번 질동안 몇 승 하는지 출력까지!

public class PMain4 {
	// 게임 시작하면서 룰 설명
	public static void printStart(String[] h) {
		System.out.println("<< 가위바위보 게임 시작 >>");
		System.out.println("==========================");
		for (int i = 1; i < h.length; i++) {
			System.out.printf("| %d. %s\t\t|\n", i, h[i]);
		}
		System.out.println("==========================");
	}
	
	//컴퓨터가 뭐 냈는지
	public static int getComHand() {
		Random r = new Random();
		int comHand = r.nextInt(3) + 1;
		return comHand;
	}
	
	// 유저가 뭐 냈는지
	public static int getUserHand() {
		Scanner k = new Scanner(System.in);
		System.out.println("뭐낼래 ? :");
		int userHand = k.nextInt();
		if (userHand < 1 || userHand > 3) {
			System.out.println("喝!!!!!!");
		} 
		return (userHand >= 1 && userHand <= 3) ? userHand : getUserHand();
	}

	// 각각 뭐 냈는지 출력해주는 함수
	public static void printHand(int user, int com, String[] hand) {
		System.out.println("==========================");
		System.out.printf("| 유저\t: %s\t|\n", hand[user]);
		System.out.printf("| 컴퓨터\t: %s\t|\n", hand[com]);
	}
	
	// 게임 한 반에 대한 판정
	public static int judge(int user, int com) {
		int game = user - com;
		if (game == 0) {
			System.out.println("무승부");
			return 0;
		} else if (game == -1 || game ==2) {
			System.out.println("패배");
			return -123123;
		} else {
			System.out.println("승리");
			return 1;
		}
	}

	// 유저가 한번 질 때까지 진행한 후에 몇 승했는지 그 결과를 받아옴
	public static int getResult(String[] hand) {
		int com = 0;
		int user = 0;
		int win = 0;
		int result = 0;
		
		while(true) {
			com = getComHand();
			user = getUserHand();
			printHand(user, com, hand);
			result = judge(user, com);
			if (result == -123123) {
				break;
			}
			win += result; // 이겼을 때는 1값, 비겼을때는 0값 받아서 계산
		}
		return win;
	}

	public static void printResult(int win) {
		System.out.println("==========================");
		System.out.printf("| %d연승으로 종료!\t|\n", win);
		System.out.println("==========================");
	}
	
	public static void activate() {
		String[] hand = {"ㅋ", "가위", "바위","보"};
					//	[ 0  ,   1,    2,    3]
		printStart(hand);
		
		int win = getResult(hand);
		printResult(win);
	}
	public static void main(String[] args) {
		activate();
	}
	
	
}







