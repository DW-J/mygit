
public class CMain1 {
	public static void main(String[] args) {
		// 신발
		// 나이키 홈페이지
		
		// 이름 : ???
		// 사이즈 : 270
		// 가격 : 110000
		// 브랜드 : 나이키
		// 정보출력
		// -----------------
		// 이름 : ???
		// 사이즈 : 270
		// 가격 : 110000
		// 브랜드 : 나이키
		// 정보출력
		// -----------------
		Shoes s1 = new Shoes();
		s1.name = "나이키코트 에어 줌 베이퍼 프로 2";
		s1.size = 270;
		s1.price = 139000;
		s1.printInfo();
		
		Shoes s2 = new Shoes();
		s2.name = "나이키코트 에어 줌 NXT";
		s2.size = 270;
		s2.price = 169000;
		s2.printInfo();
		
		// 생성자 오버로딩
		Shoes s3 = new Shoes("신발", 270, 3000);
		s3.printInfo();
		
		System.out.println("-------");
		s2.test(s2.name);
		System.out.println("-------");
		s2.test("zzzz");
		System.out.println("-------");
		
		// 커피 
		// 커피 이름 / 가격
		// 출력
		
		Coffee c = new Coffee("블루마운틴", 30000);
		c.printInfo();
		
		
	}
}












