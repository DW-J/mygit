// 클라이언트가 캐릭터 생성 기능을 만들어달라고 요구 => 만드는데 성공!
//		그렇다면 건내주는 방법은 ???
//	결론 : .java파일 말고 .jar파일로 건네줘라!
//		.java : 소스까지 공개!
//		.jar : 소스를 공개하지 않고 + 그 기능만을 전달
// JAR(Java Archive, 자바 아카이브) 파일
//		: 기계어 상태로 바꿔서 압출을 해놓은 형태

// 한국어 -개발-> .java로 저장
// (저장할때) .java파일 -번역(Compile)-> .class파일(기계어/바이트코드)을
//										자동으로 생성
// .class파일 -실행-> 

// .java파일 : 사람이 보려고 만든 것
// .class파일 : 실제로 자바에서 구동하는 것

// 왜? 굳이? 기계어 / 바이트코드로 변환해서 돌리는 걸까...?
// 		- 바이트코드를 사용하면 실행이 빠르고!
//		- 소스를 노출하면 이게 무슨 프로그램인지 알 수 있기 때문에
//			'보안'상의 이유로 !

// .jar파일만 보내주면 뭔지 모르기 때문에
// JavaDoc
// JavaDoc의 역할 : 제품 설명서!
// 우리가 만든 프로그램을 보기 쉽~~~게 HTML형식,
// 우리가 알고 있는 WEB형식으로 만들어서 보기 편~~하게 문서화 시킨것

// JavaDoc의 특징
// - 주석은 /* (내용) */
// - 주석 안쪽은 크게 2가지로 나뉨
// 		1. 설명문
//		주석의 시작에서 첫번째 태그 섹션까지의 부분
//		설명문 HTML으로 설명되기 때문에 단순 작성당시에 
//		엔터를 쳐서 줄을 바꿔서 입력했다 하더라도
//		그대로 이어져서 출력됨 
//		줄바꿈 처리를 하고 싶다면 <p>를 작성하면 됨
// 		2. 태그 섹션
//		첫번째 문자가 '@'로 시작
//			- @author : 이 프로그램의 작성자, 기본값으로 Windows 계정 ID가 나옴
//			- @version : 말 그대로 이 프로그램의 버전
//			- @param : 파라미터에 대한 설명을 할 때 사용
//			- @throws : (아직 안배웠지만 쓴적있음) 예외처리에 대한 설명
//			- @return : 메소드가 void가 아닌 반환 값이 있을 때 그것에 대한 설명
//			이 말고도 많은 태그가 있지만 우선은 이정도로...

/**
 * 게임 캐릭터의 정보를 가지고 있는 Class
 * <p>
 * @author cloud
 * @version 1.1.14
 * */


public class Player {
	String nickname;
	int level;
	String job;
	String weapon;
	
	// 생성자
	/**
	 * 게임 캐리터를 생성합니다
	 * <p> 기본 무기는 목검, 기본 직업은 초보자입니다.
	 * <p>
	 * @param name 캐릭터의 이름; 길이는 3자 이상 10자 이하여야 합니다.
	 * @throws IllegalArgumentException 캐릭터의 닉네임 길이가 정해진 범위를 벗어나면,
	 * 즉 ({@code nickname < 3 || nickname > 10})
	 */
	
	public Player(String nickname) {
		this.level = 1;
		this.job = "초보자";
		this.weapon = "목검";
		if (nickname.length() < 3 || nickname.length() > 10) {
			throw new IllegalArgumentException("캐릭터의 이름은 3자 이상 10자 이하입니다.");
		}
		this.nickname = nickname;
	}
	
	/**
	 * 캐릭터의 레벨을 올려주는 메소드입니다.
	 */
	public void levelUp() {
		this.level++;
	}
	
	/**
	 *캐릭터의 직업을 변경합니다.
	 *@param job 캐릭터의 변경할 직업
	 *@throws IllegalArgumentException 캐릭터의 레벨이 10을 넘지 않았다면 발생합니다.
	 */
	public void setJob(String job) { 
		if (this.level < 10) {
			throw new IllegalArgumentException("캐릭터의 레빌이 10을 넘지 않습니다.");
		}
		this.job = job;
	}
	
	/**
	 * 생성된 캐릭터의 status값을 보여주는 메소드입니다.
	 */
	public void playerInfo() {
		System.out.printf("닉네임 : %s\n", this.nickname);
		System.out.printf("레벨 : %d\n", this.level);
		System.out.printf("직업 : %s\n", this.job);
		System.out.printf("무기 : %s\n", this.weapon);
	}
}
