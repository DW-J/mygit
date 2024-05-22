// A is a B : 상속관계
// 쇼핑몰 - '상품'에 대한 정보를 게시하고 싶음
public class IMain2 {
	public static void main(String[] args) {
		// 신발 (이름, 가격, 사이즈)
		Shoes s = new Shoes("나이키", 110000, 270);
		// 출력
		s.printInfo();
		System.out.println("----------");
		
		// 컴퓨터 (이름, 가격, cpu, ram, hdd)
		Computer c = new Computer("컴퓨터", 500000, "i7-12312", 16, 500);
		// 출력
		c.printInfo();
		System.out.println("----------");
		
		// 노트북 (이름, 가격, cpu, ram, hdd, 무게, 배터리 지속시간)
		Laptop l = new Laptop("노트북", 800000, "i5-12312", 16, 500, 1.5, 14.5);
		// 출력
		l.printInfo();
		System.out.println("----------");
	}
}















