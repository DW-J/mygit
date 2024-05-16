import java.util.Scanner;

public class YMain2 {
	public static void main(String[] args) {
		// 국어, 수학, 영어 점수를 각각 입력받아서 출력
		// + 총점과 평균점수끼지 출력
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = keyboard.nextInt();
		System.out.print("수학 점수 : ");
		int math = keyboard.nextInt();
		System.out.print("영어 점수 : ");
		int eng = keyboard.nextInt();
		
		System.out.printf("국어 : %d점\n", kor);
		System.out.printf("수학 : %d점\n", math);
		System.out.printf("영어 : %d점\n", eng);
		
		System.out.printf("총점 : %d점\n", kor + math + eng );
		System.out.printf("평균 : %.1f점\n", 
				(double) (kor + math + eng) / 3 );
		//		ㄴ> '실수'로 '정수'를 표현하게 세팅
		// int / int = int =>자바에서 정수 나누기 정수는 정수로 나오게 되있다 !
		
		
		keyboard.close();
		
		
		
		
		
		
		
		
	}
}
