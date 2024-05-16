import java.util.Scanner;

public class PMain7 {
	// 거스름돈 환전 프로그램
	// 함수 사용 (0)
	
	// <입력>
	// 구매한 물건 가격 : 35000
	public static int marketPrice() {
		Scanner k = new Scanner(System.in);
		System.out.print("구매한 물건 가격 : ");
		int price = k.nextInt();
		return price;
	}
	// 낸 돈 : 41530
	public static int payMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.print("내가 낸 돈 : ");
		int money = k.nextInt();
		if (money < price) {
			System.out.println("돈이 부족합니다. 다시 입력해주세요.");
		}
		return (money >= price) ? money : payMoney(price);
	}
	// ----------------------
	
	// 거스름돈 : 6530 을
	public static int calcChange(int price, int money) {
		return money - price;
	}
	
	public static void printChange(int price, int moeny, int change) {
		System.out.println("======================");
		System.out.printf("물건 가격 : %,d원\n", price );
		System.out.printf("낸 돈 : %,d원\n", moeny);
		System.out.printf("거스름돈 : %,d원\n", change);
		System.out.println("======================");
	}
	
	public static void takeChange(int change) {
		// 2가지 방법..
		// 1. 화폐단위를 배열에 때려넣는다..
//		int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		for (int i = 0; i < currency.length; i++) {
//			if (change >= currency[i]) {
//				System.out.printf("%d원권 : %d개\n", currency[i], 
//						(change / currency[i]));
//				change %= currency[i];
//			}
//		}
		
		// 2. 
		int currency2 = 100000;
		while (true) {
			currency2 /= 2;
			if (change >= currency2) {
				System.out.printf("%원권 : %d개\n", currency2,
						(change / currency2));
				change %= currency2;
			}
			currency2 /= 5;
			if (change >= currency2) {
				System.out.printf("%원권 : %d개\n", currency2,
						(change / currency2));
				change %= currency2;
			}
			
			if (currency2 == 10) {
				break;
			}
		}
	}
	// 		50000 : 0
	// 		10000 : 0
	// 		5000 : 1
	//		1000 : 1
	//		500 : 1
	//		100 : 0
	// 		50 : 0
	//		10 : 3
	// 		0개짜리는 출력 X!
	
	
	
	public static void main(String[] args) {
		int price = marketPrice();
		int money = payMoney(price);
		int change = calcChange(price, money);
		printChange(price, money, change);
		takeChange(change);
	}
}
