// 실행용 Class : 프로그램 실행을 위한 main() method를 제공하는 역할
public class OMain4 {
	// 이름, 사는곳 속성을 가진 학생 객체
	// 속성을 출력하는기능까지
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "정다운";
		s1.address = "서울";
		System.out.println("s1이 Student 객체를 참조");
		System.out.println(s1);
		s1.printStudentInfo();
		System.out.println("-----------------------");
		// 완전히 독립한 서로 다른 객체
		Student s2 = new Student();
		s2.name = "정겨운";
		s2.address = "인천";
		System.out.println("s2가 Student 객체를 참조");
		System.out.println(s2);
		s1.printStudentInfo();
		
	}
	
}
