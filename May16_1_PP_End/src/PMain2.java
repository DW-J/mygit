import java.util.Random;
import java.util.Scanner;

// UP&DOWN 게임(함수 사용 0)
// 컴퓨터 1 ~ 100 사이의 숫자를 뽑음 (ex : 34)
// 유저가 입력
//		1트 : 50 => down!
//		2트 : 20 => up!
//		...
//		10트 : 34 => 정답!

public class PMain2 {
	
	// 컴퓨터 1 ~ 100 사이의 숫자를 뽑음
	public static int getNumber() {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		return num;
		// retrun new Random().nextInt(100) + 1;
	}
	
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.println("정답은 ? : ");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("정답은 1 이상이어야 합니다.");
		} else if (answer > 100) {
			System.out.println("정답은 100 이하이어야 합니다.");
		}
		return (answer >= 1 && answer <= 100) ? answer : getUserAns();
	}
	
	// 정답은 한 번 입력했을 때 정답인지 아닌지 확인
	//		+ 정답일때 반복문을 깰지 말지 전달됨
	public static boolean checkAnswer(int number, int answer) {
		if (number == answer) {
			System.out.print("정답은 ");
			return true; 	// 정답일 때 true값을 리턴하면서 종료되게
		} else if(number > answer) {
			System.out.println("Up !");
//			return false; 	// 정답이 아닐때 false값을 리턴하면서 게임이
							// 계속 진행되도록
		} else {
			System.out.println("Down !");
//			return false;
		}
		return (number == answer); // 이 조건에 맞을 때 true값을 리턴하고,
								   // 조건에 맞지 않으면 false값을 리턴 
	}

	// 정답을 맞출때까지 반복하는 함수
	public static void printResult() {
		int number = getNumber();
		int answer = 0;
		int turn = 0;
		
		while (true) {
			turn++;
			answer = getUserAns();
			if (checkAnswer(number, answer)) { // true면 if실행
				System.out.printf("[%d] !\n", number);
				System.out.printf("%d번 만에 정답 !\n", turn);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		printResult();
	}
}





