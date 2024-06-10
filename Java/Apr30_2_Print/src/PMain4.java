
public class PMain4 {
	// 명함 만들기
	// 이름 / 나이 / 성별 / 키 / 사는 지역 / 별명(printf)
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("__________________________");
		System.out.printf("*정다운*\n\n "
				+ "\t\t나이 : %2d\n"
				+ "\t\t성별 : %s\n "
				+ "\t\t신장 : %3d\n "
				+ "\t\t사는곳 : %s\n"
				+ "\t\t별명 : %s"
				, 30, "남자", 167, "서울", "피오\n");
		System.out.println("__________________________");
		

		System.out.println("\n+++++++++++++++++++++++++++++\n");
		
		System.out.println("*********************");
		System.out.printf("*이름\t: %s\n", "\t정다운*");
		System.out.printf("*나이\t: \t%2d\0\0*\n", 30);
		System.out.printf("*성별\t: %s\n", "\t남 자*");
		System.out.printf("* 키\t: \t%3d\0*\n", 167);
		System.out.printf("*사는곳\t: %s\n", "\t서 울*");
		System.out.printf("*별명\t: %s\n", "\t피 오*");
		System.out.println("*********************");
		
		Thread.sleep(10000);
	}

}
