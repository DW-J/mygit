import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) {
		// 키(cm), 몸무게(kg)를 입력받아서
		//		=> 비만도 검사 프로그램
		
		// 표준체중 = (키 - 100) * 0.9
		// 비만도 = (실제 체중 / 표준체중) * 100
		// 비만도가 120을 넘으면 "비만",
		// 아니면 "안비만" 문구를 출력
		// 아무 키나 입력했을 때 프로그램이 종료되게!
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		System.out.print("몸무게 : ");
		double weight = keyboard.nextDouble();
		
		//System.out.printf("당신의 키는 %.1fcm 입니다.\n", height);
		//System.out.printf("당신의 몸무게는 %.1fkg 입니다.\n", weight);
		
		//int averageW = (height - 100) * 0.9;
		
		
//내가	String RUFat = ((weight / ((height - 100) * 0.9)) * 100) > 120 ? "비만" : "안비만";
//쓴거	System.out.println(RUFat);
		
		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight / stdWeight) * 100;
		String result = (bimando > 120) ? "비만" : "안비만";
		
		System.out.printf("당신은 키가 %.1fcm\n" + "몸무게가 %.1fkg이므로\n"
				+ "비만도가 %.1f라서 %s입니다.\n", height, weight, bimando, result);
		
		System.out.print("아무 키나 입력하세요 : ");
		String bye = keyboard.next();
		System.out.println("프로그램을 종료합니다.");
		
		
		
		keyboard.close();
		
		
	}
}
