
public class IMain3 {
	public static void main(String[] args) {
		// 홍길동, 17살, 논현고등학교, 1학년 	=> 출력
		Student s1 = new Student("홍길동", 17, "논현고등학교", 1);
		s1.printInfo();
		System.out.println("----------");
		// 김길동, 21살, 성균관대학교, 2학년 	=> 출력
		Student s2 = new Student("김길동", 21, "성균관대학교", 2);
		s2.printInfo();
		System.out.println("----------");
		// 고길동, 22살, 육군, 상병			=> 출력
		Soldier sol = new Soldier("고길동", 22, "육군", "상병");
		sol.printInfo();
		System.out.println("----------");
		
		Pen p = new Pen();
		System.out.println("----------");
		Pen p2 = new Pen("빨강");
		System.out.println("----------");
		Pen p3 = new Pen("빨강", 300, "검정");
		System.out.println("----------");
	
		// 이름이 패션마스크, 가격이 1000원인 마스크
		Product2 pr2 = new Product2("패션마스크", 1000);
		pr2.printInfo();
		System.out.println("----------");
		
		Mask m = new Mask("패션마스크", 1000);
		m.printInfo();
		System.out.println("----------");
		
		
	}
}






