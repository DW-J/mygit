
public class YMain {
	public static void main(String[] args) throws InterruptedException {
		// 학원오는데 얼마나 걸렸는지 (시간) : 30분
		//어제 저녁메뉴 : ???
		// 어제 뭐하셨나요 : ???
		// 취침 시간 : ?시 ?분
		// 첫 수업 소감 : ??? 
		// 수업 성취도 : ?.?%
		// 출력
		
		// => 5초 정도 딜레이 걸어서 => .bat로 실행까지!

		System.out.println("************************");
		
		System.out.printf("학원 오는데 걸린 시간 : %2d분\n", 30);
		System.out.printf("어제 저녁메뉴 : %s\n", "새우 매운탕");
		System.out.printf("어제 뭐하셨나요 : %s\n", "누워서 유튜브");
		System.out.printf("취침 시간 : %2d시 %2d분\n", 2, 00);
		System.out.printf("첫 수업 소감 : %s\n", "선생님이 친절하고\n"
				+ "\t수업이 재밌었어요");
		System.out.printf("수업 성취도 : %.1f%%\n", 100.1);
		
		System.out.println("************************");
		Thread.sleep(5000);
	}
}
