
public class VMain2 {
	public static void main(String[] args) {
		// 이름, 오늘 날짜 (연도.월.일), 사는 곳(지역),
		// 시력, java경험의 유무(%b) 를 변수에 담아서 출력
		
		int year = 2024;
		int month = 5;
		int day = 2;
		double sight = 0.5;
		boolean java = true;
		String myName = "정다운";
		String myPlace = "서울";
		
		//System.out.printf("이름 : %s\n" , name1);
		System.out.println("이름 : " + myName);
		
		System.out.printf("오늘 날짜 : %d년 %d월 %d일\n", year, month, day);
		
		//System.out.printf("사는 곳 : %s\n", place1);
		System.out.println("사는 곳 : " + myPlace);
		
		System.out.printf("시력 : %.1f\n", sight);
		
		//System.out.printf("Java경험 유무 : %b\n",java);
		System.out.println("Java경험 유무 : " + java);
		
		// 섬유향수
		// 1000원
		// 80ml
		// 체리블라썸
		// 향균은 99.9%
		// 무색
		// 다이소
		// 재활요 해야함(true / false)
		System.out.println("************************");
		
		String pName = "섬유향수";
		int price = 1000;
		int size = 80;
		String Aroma = "체리블로썸";
		double Antib = 99.9;
		//String Color = "무색";
		char Color = '무';
		String comp = "다이소";
		Boolean recycle = true;
		
		System.out.println("제품명 : " + pName);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("용량 : %dml\n", size);
		System.out.println("향 : " + Aroma);
		System.out.printf("향균 : %.1f%%\n", Antib);
		System.out.println("색 : " + Color);
		System.out.println("판매처 : " + comp);
		System.out.println("재활용 유무 : " + recycle);
		
		System.out.println("*************************");
		
		
		
		
	}
}
