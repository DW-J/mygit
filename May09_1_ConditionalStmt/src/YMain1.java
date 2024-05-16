import java.util.Scanner;

public class YMain1 {
	// (3보다 작은) 정수를 하나 입력받는 함수
	// 3보다 크거나 같을 때 => 정수를 다시 입력 받을 수 있도록!
  /*public static int lessthenThree(int a) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = keyboard.nextInt();
		return num;
	}
	public static int biggerthenThree(int num) {
		int judge = (num >= 3) ? lessthenThree(num) : num;
		System.out.println(judge);
		return judge;
	}*/
	
	public static int getNum() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = keyboard.nextInt();
		return (num < 3) ? num : getNum();
	}
	
	
	
	// 홀수만 입력받을 수 있는 함수
	// => 짝수를 입력하면 다시 입력 받을 수 있도록!
/*	public static int onlyodd(int a) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int even = keyboard.nextInt();
		return even;
	}
	
	public static int noteven(int even) {
		int judge = (even % 2 == 1) ? onlyodd(even) : even;
		System.out.println(judge);
		return judge;
	}*/
	public static int getNum2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("홀수 입력 : ");
		int num = keyboard.nextInt();
		return (num % 2 == 1) ? num : getNum2();
	}
	
	
	
	// 정수를 입력받는 함수 => 0 ~ 100
	// => 범위안의 정수가 아니라면 다시 입력 받을 수 있도록!
/*	public static int inonehundred(int a) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num3 = keyboard.nextInt();
		return num3;
	}
	public static int notonehundred(int num3) {
		int judge3 = ((num3 > 100) && (num3 < 0)) ? onlyodd(num3) : num3;
		System.out.println(judge3);
		return judge3;
	}*/
	
	public static int getNum3() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("0 ~ 100 : ");
		int num = keyboard.nextInt();
		return ((num >= 0) && (num <= 100) ? num : getNum3());
	}
	
	public static void main(String[] args) {
		/*int num = lessthenThree(0);
		int judge = biggerthenThree(num);
		System.out.println(judge);
		System.out.println("--------------------");
		
		int n2 = onlyodd(0);
		int j2 = noteven(n2);
		System.out.println(j2);
		System.out.println("--------------------");*/
		
		int num1 = getNum();
		System.out.println(num1);
		
		int num2 = getNum2();
		System.out.println(num2);
		
		int num3 = getNum3();
		System.out.println(num3);
		
	}
	
}
