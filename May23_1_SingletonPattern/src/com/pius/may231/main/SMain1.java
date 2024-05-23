package com.pius.may231.main;

import com.pius.may231.nameless.Nameless;

// 원하는 객체 하나 생성
// 이름, 나이, 별명
// 출력

// 유일한 무명객이었으면 좋겠음!
// 디자인 패턴 프로그래밍 중에
// 		*** 싱글톤 패턴 (Singleton Pattern)
// 클래스가 최초 한번만 메모리를 할당하고(Static)
// 		그 메모리에 객체를 만들어서 사용하는 디자인 패턴
// 고정된 메모리 영역을 얻으면서 하나의 객체를 사용하기 때문에 
//		메모리 낭비를 방지할 수 있음
public class SMain1 {
	public static void main(String[] args) {
//		Nameless n = new Nameless("무명객", 28, "방망이 협객");
//		n.printInfo();
//		System.out.println(n);
//		System.out.println("------------");
//		Nameless n2 = new Nameless("무명객", 28, "방망이 협객");
//		n2.printInfo();
//		System.out.println(n2);
//		System.out.println("------------");
		
		Nameless n1 = Nameless.getNameless();
		n1.printInfo();
		System.out.println(n1);
		System.out.println("==========");
		Nameless n2 = Nameless.getNameless();
		n2.printInfo();
		System.out.println(n2);
		System.out.println("==========");
		
		
	}
}
