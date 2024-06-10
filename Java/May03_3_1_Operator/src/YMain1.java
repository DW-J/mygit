import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		
		// 오늘 기분은 어떤가요 ?
		// 오늘 컨디션 점수는 ?
		// 대중교통 몇 번 갈아타고 오셨는지 ?
		// 밤에 푹 주무셨는지 (잘 잤으면 true / 아니면 false)
		// 몇 시간 주무셨나요 ? (ex : 6.0시간)
		
		// Scanner로 입력을 받아서 출력까지 !
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("오늘 기분은 어떤가요 ? : ");
		String Feeling = keyboard.next();	
		
		System.out.print("오늘 컨디션 점수는 ? : ");
		int Condition = keyboard.nextInt();	
		
		System.out.print("대중교통 몇 번 갈아타고 오셨나요 ? : ");
		int Transport = keyboard.nextInt();		
		
		System.out.print("밤에 푹 주무셨는지 ? : ");
		boolean sleepWell = keyboard.nextBoolean();	
		
		System.out.print("몇 시간 주무셨나요 ? : ");
		double sTime = keyboard.nextDouble();
		
		System.out.println("*****************************");

		System.out.println("오늘 기분은 어떤가요 ? : " + Feeling);
		System.out.printf("오늘 컨디션 점수는 ? : %d점\n", Condition);
		System.out.printf("대중교통 몇 번 갈아타고 오셨나요 ? : %d번\n", Transport);
		System.out.printf("밤에 푹 주무셨는지 ? : %b\n", sleepWell);
		System.out.printf("몇 시간 주무셨나요 ? : %.1f시간\n", sTime);
		
		System.out.println("*****************************");
		
		keyboard.close();
		
		
		
				
	}
}
