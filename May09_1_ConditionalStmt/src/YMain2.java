import java.util.Scanner;

public class YMain2 {
	// 정수 2개를 입력받아서 (각각의 함수에)
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.println("숫자1 입력 : ");
		int x = k.nextInt();
		return x;
	}
	public static int getY() {
		Scanner k = new Scanner(System.in);
		System.out.println("숫자2 입력 : ");
		int y = k.nextInt();
		return y;
	}
	
	// 그 정수 2개를 더했을 때 짝수면 결과 리턴, 아니면 값을 재입력
	public static int getResult(int x, int y) {
		int sum = x + y;
//		return (sum % 2 == 0) ? sum : getResult(x, y);
										// 원하는 값이 들어오지 않으면
										// 무한 루프가 돌아감
				// => 처음 솔수를 입력한 값이 계속해서 계산됨!
		return (sum % 2 == 0) ? sum : getResult(getX(), getY());
	}
	
	public static void main(String[] args) {
		int x = getX();
		int y = getY();
		int sum = getResult(x, y);
		System.out.println(sum);
	}
}
