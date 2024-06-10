// 객체간의 관계
// A is a B : Dog is a Animal
public class IMain1 {
	public static void main(String[] args) {
		// 동물(Animal) 객체 => sort, age + 정보 출력 기능
		// 여기서 Animal 은 부모/ 상위클래스
		// Cat는 자식/하위클래스
		Cat c = new Cat();
		c.printInfo();
		System.out.println("---------------");
		
		Dog d = new Dog("리트리버", 5, "집");
		d.printInfo();
	}
}















