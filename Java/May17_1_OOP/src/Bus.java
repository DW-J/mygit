// function - 클래스 밖에 만든 것 - X (사실상 Java에는 function이라는 용어가 없음)
// method - Class 소에 만든 것 (Class에 종속적인 함수라고도 표현)
//		  - 여태까지 써왔던건 다 method였던거임!!! ㄴ0ㅇ0ㄱ !!!!!!! => 충! 격! 실! 화!



// Class : 객체를 짝어내는 틀 (ex: 붕어빵 틀, 도장)
public class Bus {
	//멤버변수 (Member Variable)  - 속성 ( = attribute, field, 전역변수)
	//							- 객체의 데이터가 저장되는 공간
	
	// 버스번호 
	int busNum;
	// 차종
	String busBrand;
	// 버스회사 
	String busCompany;
	// 기사님이름 
	String driverName;
	// 시작점
	String startLocation;
	
	public void printInfo() {
		// this : 자기 자신을 말한다 (this. : 생략 가능 O)
		System.out.println(this.busNum);
		System.out.println(busBrand);
		System.out.println(busCompany);
		System.out.println(busCompany);
		System.out.println(driverName);
		System.out.println(startLocation);
	}
	
	// method - 액션, 프로그램상 필요한 기능
	//		  - 객체의 동작에 해당하는 실행 블록
	public void go() {
		System.out.println("부릉부릉 ~");
	}
	
	
}








