import java.util.Iterator;
import java.util.Scanner;

// main함수에서 진행
// 1을 입력하면 학생 수 값을 입력 받을 수 있게
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게 (점수 범위 고려 X)
// 3을 입력하면 학생들의 점수리스트를 출력할 수 있게 (ex: 1번 학생 점수 : 50점)
// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
// 5를 입력하면 프로그램 종료

public class PMain6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int menu = 0;
		int studentNum = 0;
		// 배열의 기본값 = null
		int[] scores = null;
				
			a : while(true) {
				System.out.println("----------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수 리스트 | "
						+ "4.점수 분석 | 5.프로그램 종료");
				System.out.println("----------------------------------");
				System.out.print("선택> ");
				menu = k.nextInt();
				
				switch (menu) {
				case 1:
					System.out.println("학생 수 : ");
					studentNum = k.nextInt();
					scores = new int[studentNum];
					break;
				case 2:
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("%d번 학생 점수 입력 : ", i + 1);
						scores[i] = k.nextInt();
					}
					break;
				case 3:
					int index = 1;
					for (int i : scores) {
						System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
					}
					break;
				case 4:
					int max = 0;
					int sum = 0;
					double avg = 0;
					for (int i : scores) {
						sum += i;
						max = (max < i) ? i : max;
					}
					avg = (double) sum / scores.length;
					System.out.printf("최고 점수 : %d\n", max);
					System.out.printf("평균 점수 : %d\n", avg);
					break;
				case 5:
					System.out.println("종료합니다");
					System.out.println("----------------------------------");
					//break; //=>Switch 깨는 명령문
					break a;
				default:
					System.out.println("----------------------------------");
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오.");
					break;
				}
				
//				if (menu == 1) {
//					System.out.println("학생수 : ");
//					int std = k.nextInt();
//					System.out.printf("현재 학생수는 %d명입니다.\n", std);
//					
//				} else if (menu == 2) {
//					System.out.println("점수 : ");
//					int stdscore = k.nextInt();
//					
//				} else if (menu == 3) {
//					
//				} else if (menu == 4) {
//					
//				} else if (menu == 5) {
//					System.out.println("\t프로그램 종료 !");
//					System.out.println("----------------------------------");
//					break;
//				} 
			}
	}
}
