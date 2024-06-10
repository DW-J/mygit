import java.util.Iterator;

// 이중 for문 >> for문안에 for문 >> 중첩 for문

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 6; i++) {
//			System.out.printf("i값 : %d----------\n", i);
//			for (int j = 1; j < 6; j++) {
//				System.out.printf("j값 : %d\n", j);
//			}
//		}
//		System.out.println("------------------");
		
		// 구구단
		// <2단>
		// 2 * 1 = 2 
		// 2 * 2 = 4
		// ...
		// 9 * 9 = 81
		System.out.println("구구단");
		for (int i = 2; i < 10; i++) {
			System.out.printf("<---%d단--->\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}
		System.out.println("----------");
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("<---%d단--->\t", i);
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d X %d = %d\t", dan, i, dan * i);
			}
			System.out.println();
		}
		
	}
}
