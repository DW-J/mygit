
public class FMain4 {
	
	// *** 고오오오오오오오오오급 기술!!!
	// 오버로딩(Overloading)
	// 	함수명 같게, 파라미터를 다르게 하는 기술
	//	호출할 때 어떤 값을 넣었느냐에 따라 함수가 불러지게 하는 기술
	
	// 같은 자료형을 써도(예:iii), 파라미터의 갯수가 다르면 오버로딩 O
	// 파라미터의 갯수가 같아도, 다른 자료형을 사용하면 오버로딩 O
	// => ** '그 함수들이 같은 기능을 하고있다' 라는 전제조건!
	
	
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	public static void iii(int a, int b) {
		System.out.println(a + b);
	}
	
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	public static void iii(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	public static void iii(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	// 정수 1개를 넣으면 => 윽! 출력
	public static void printSomthing(int a) {
		System.out.println("윽!");
	}
	
	// 문자열 1개를 넣으면 => 악! 출력
	public static void printSomthing(String a) {
		System.out.println("악!");
		
	}
	
	// 실수 1개를 넣으면 => 으아아악! 출력
	public static void printSomthing(double a) {
		System.out.println("으아아악!");
	}
	
	// 아무것도 넣지 않으면 => ... 출력
	public static void printSomthing() {
		System.out.println("...");
	}

	public static void main(String[] args) {
		iii(1, 8);
		iii(1, 3, 6);
		iii(3.2, 3.6, 5.1);
		printSomthing(4);
		printSomthing("ㅁㄴ");
		printSomthing(4.4);
		printSomthing();
		
		// 사실 우리는 첫날부터 이 오버로딩을 사용하고 있었습니다 !
		//ㄴ0ㅇ0ㄱ
		// System.out.println();
	}
}
