
public class WhatIsValue {

	// 알고싶은 자료형의 기본값을 멤버변수로 만들어서

	// 기본형 - 정수
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	// 기본형 - 논리, 문자
	boolean booleanField;
	char charField;
	
	// 기본형 - 실수
	float floatField;
	double doubleField;
	
	// 참조형 - 문자열, 배열
	String stringField;
	int[] arrayField;
	
	// 출력하는 메소드를 생성
	public void printInfo() {
		System.out.println("byte : " + byteField);
		System.out.println("short : " + shortField);
		System.out.println("int : " + intField);
		System.out.println("long : " + longField);
		System.out.println("boolean : " + booleanField);
		System.out.println("char : " + charField); // 기본값은 띄어쓰기
												   // (유니코드 : \u0000)
		System.out.println("float : " + floatField);
		System.out.println("double : " + doubleField);
		System.out.println("String : " + stringField);
		System.out.println("Arrat : " + arrayField);
	}
	// 점심 메뉴를 입력해서 랜덤으로 정해주는 코드를 짜보자(주말에)
}
