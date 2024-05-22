import java.util.jar.Attributes.Name;

// A has a B : 포함관계
public class HMain1 {

	public static void main(String[] args) {
		// 이름이 Andrew Kim, 남자, 핸드폰 번호가 010-1234-5678
		// 출력
		Person person = new Person("Andrew Kim", "남자", "010-1234-5678");
		person.printInfo();
		System.out.println("=======================");
		
		// 강남포차, 논현동, 02-1111-2222, Andrew Kim의 식당
		// 출력(식당 주인의 정보까지)
		Restaurant restaruant = new Restaurant("강남포차", "논현동", "02-1111-2222", person);
		restaruant.printInfo();
		System.out.println("=====================");
		
		// 계란말이, 22000원, 강남포차에서 파는 메뉴
		// 관련된 전체 정보를 출력
		Menu menu1 = new Menu("계란말이", 2000, restaruant);
		menu1.printInfo();
		System.out.println("====================");
		
		// 석쇠불고기, 25000원, 강남포차에서 파는 메뉴
		// 관련된 전체 정보를 출력
		Menu menu2 = new Menu("석쇠불고기", 25000, restaruant);
		menu2.printInfo();
		System.out.println("====================");
		
		// 석쇠, 5000원, 석쇠불고기를 담은 접시
		// 관련된 전체 정보를 출력
		Dish dish = new Dish("석쇠", 5000, menu2);
		dish.printInfo();
		System.out.println("====================");

		// 가락시장, 송파구, 석쇠를 구매한 시장
		// 관련된 전체 정보를 출력
		Market market = new Market("가락시장", "송파구", dish);
		market.printInfo();
		System.out.println("=====================");

		//곽두팔, 가락시장을 좋아하는 상인
		// 관련된 전체 정보를 출력
		Marchant marchant = new Marchant("곽두팔", market);
		marchant.printInfo();
		System.out.println("====================");
		
		// 곽두팔의 이름만 출력
		System.out.println(marchant.name);
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장 정보를 전체 출력
		marchant.market.printInfo();
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장은 어디에? 출력
		System.out.println(marchant.market.location);
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장에서 산 접시 전체정보 출력
		marchant.market.dish.printInfo();
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴 전체 정보
		marchant.market.dish.menu.printInfo();
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴의 가격
		System.out.println(marchant.market.dish.menu.price);
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 연락처
		System.out.println(marchant.market.dish.menu.where.phone);
		System.out.println("====================");
		
		// 곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 시당 주인 연락처
		System.out.println(marchant.market.dish.menu.where.owner.phone);
		System.out.println("====================");
		
		// 계란말이를 파는 사람 연락처
		System.out.println(menu1.where.owner.phone);
		System.out.println("====================");

		
		
	}
}





















