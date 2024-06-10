import java.util.Scanner;

public class KIMain2 {
	public static void main(String[] args) {
		// 메뉴판 (중국집)
		// 짜장면, 짬뽕, 탕수육, 볶음밥
		// 가격을 입력받아서
		// 메뉴판 모양으로 출력
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("짜장면 : ");
		int bbNuddle = keyboard.nextInt();
		
		System.out.print("짬뽕 : ");
		int sfNuddle = keyboard.nextInt();
		
		System.out.print("탕수육 : ");
		int fPork = keyboard.nextInt();
		
		System.out.print("볶음밥 : ");
		int fRice = keyboard.nextInt();

		System.out.print("음료수 : ");
		int Drink = keyboard.nextInt();
		
		System.out.println("*************************");
		System.out.println("*\t메뉴판\t\t*");
		System.out.println("*************************");
		System.out.printf("*짜장면 : \t%,7d원*\n", bbNuddle);
		System.out.printf("*짬뽕 \0: \t\t%,7d원*\n", sfNuddle);
		System.out.printf("*탕수육 : \t%,7d원*\n", fPork);
		System.out.printf("*볶음밥 : \t%,7d원*\n", fRice);		
		System.out.printf("*음료수 : \t%,7d원*\n", Drink);		
		System.out.println("*************************");
		
		keyboard.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
