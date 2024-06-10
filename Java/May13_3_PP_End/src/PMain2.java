import java.util.Scanner;

public class PMain2 {
	
	// ATM기능을 하는 프로그램
	// 1을 고르면 입금[deposit] / 2를 고르면 출금[withdrawal]
	// 3을 고르면 잔액 확인check balance / 4를 고르면 프로그램 종료
	// 입금, 출금 돈 값을 입력 받을 것!
	// main 함수에
	
	
	public static void main(String[] args) {
		int choice = 0;
		int money = 0;
		Scanner k = new Scanner(System.in);
		
			while(true) {
				System.out.println("----------------------------------");
				System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
				System.out.println("----------------------------------");
				System.out.println("선택> ");
				choice = k.nextInt();
				
				if (choice == 1) {
					System.out.println("예금액> ");
					int plusMoney = k.nextInt();
					System.out.printf("\t%,d원을 예금합니다.\n", plusMoney);
					money += plusMoney;
				} else if (choice == 2) {
					System.out.println("출금액> ");
					int minusMoney = k.nextInt();
					System.out.printf("\t%,d원을 출금합니다.\n", minusMoney);
					money -= minusMoney;
					if (money < 0) {
						System.out.println("\t...");
						System.out.println("\t잔고가 모자랍니다.");
						System.out.println("\t출금에 실패했습니다.");
						money += minusMoney;
					}
				} else if (choice == 3) {
					System.out.printf("\t%,d원이 남아있습니다.\n", money);
				} else if (choice == 4) {
					System.out.println("\t프로그램 종료 !");
					System.out.println("----------------------------------");
					break;
				} 
			}
	}
	
	

}
	
