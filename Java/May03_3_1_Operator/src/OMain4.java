import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// 이름을 입력을 받을거에요!
		// 그 이름이 '홍길동'이랑 같은지 true / false
		
		Scanner keyboard = new Scanner(System.in);
	/*	
		System.out.print("이름을 입력하시오 : ");
		String name = keyboard.next();
		
	
		boolean name1 = (name == "홍길동");
		System.out.println(name1); // => true / 하지만 결과는 false
		
		// *** String 문자열이 같은지 비교
		// ★ 대상의 값 자체를 비교하기 위해서 .equals()를 사용! ★
		
		boolean name2 = name.equals("홍길동");
		System.out.println(name2); // => true!!
		System.out.println("---------------------");
		
		// shift : 옮기다. 이동하다
		// ( 십진수 << 정수 ) 의 형태
		// << : 앞에 있는 수(십진수)를 2진수로 바꾸고,
		// 뒤에 있는 수(정수)만큼 왼쪽으로 밀어라!
		// 비어있는(오른쪽) 칸 수를 0으로 채우고,
		// 2진수를 다시 10진수로 바꿔라!!
		
		// ex) 카페! (조건 검색)
		//		24시간 : 1 << 0 = 1
		//		와이파이 : 1 << 1 = 2
		//		흡연실 : 1<< 2 = 4
		//		주차장 : 1<< 3 = 8
		
		int c = (150 << 6);
		System.out.println(c);
		
		// 연산자
		//		단항 연산자 : a++, a--, !a, ...
		//		이항 연산자 : a + b, a > b, ...
		//		삼항 연산자 : 
		//			조건을 따져서 값을 대입항 때 사용
		//			if문으로 대체가 가능함  
		//			문법이 길어짐
		// 조건식 '?' 조건을 만족할 때 쓸 값 : 조건불성립시 쓸 값
		
		// 나이 값도 입력받아서
		// 나이가 20살 이상이면 '안녕하세요' 를 출력
		// 나이가 20살 미만이면 'NAGA!' 를 출력
		
		System.out.print("당신의 나이는? : ");
		int age = keyboard.nextInt();
		System.out.printf("당신의 나이는 : %d살 입니다\n", age);
		String result = (age >= 20) ? "안녕하세요" : "NAGA!";
		System.out.println(result);
		
		
//내		if (age > 20) 
//가		System.out.println("안녕하세요");
//쓴		else
//거		System.out.println("NAGA!");
		
		
		// 홍길동씨 : 1강의장
//내		String myclass = (name2) ? "1강의장 입니다." : "2강의장 입니다.";
//가		System.out.println(myclass);
//		
		// 나이가 짝수 : 1강의장
//쓴		String result2 = (age % 2 == 0) ? "1강의장 입니다." : "2강의장 입니다.";
//거		System.out.println(result2);		
		
		// 나머지는 : 2강의장
		String Myclass = ((age % 2 == 0) || name.equals("홍길동"))  
				? "1강의장 입니다." : "2강의장 입니다.";
		System.out.println(Myclass);
	*/	
		// 상자 하나에 야구공이 6개 들어갈 수 있습니다
		// 공의 갯수를 입력받아서
		// 공을 모두 담을 상자의 갯수가 몇 개인지 출력
		// ex) 공이 49개 => 상자는 9개
		
		System.out.print("공의 갯수를 입력하시오 : ");
		int ball = keyboard.nextInt();
		
		System.out.printf("공은 모두 %d개\n", ball);
		
		int box = (ball % 6 ==0 ? ball / 6 : ball / 6 + 1);
	
		System.out.printf("필요한 상자의 개수는 %d", box);
		
//		System.out.printf("%d개의 공을 넣는데 "
//				+ "필요한 상자의 갯수 : %d개\n", ball, box);
		
		
		
	}
}




















