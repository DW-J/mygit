package com.pius.may224.main;

import javax.swing.JFrame;

import com.pius.may224.coffee.Coffee;
import com.pius.may224.human.Human;

public class OMain1 {
	
	public static void main(String[] args) {
//		// 타이틀이 ㅋㅋㅋ인 JFrame
//		JFrame f = new JFrame("ㅋㅋㅋ");
//		// 사이즈를 300, 500 수정
//		f.setSize(300, 500);
//		// 타이틀을 ㅎㅎㅎ로 수정
//		f.setTitle("ㅎㅎㅎ");
//		// 보이게 하고 싶음
////		f.show();
//		f.setVisible(true);
		
		// 커피
		// 이름이 아메리카노, 3000원
		Coffee c = new Coffee("아메리카노", 3000);
		c.printInfo();
		System.out.println("--------------");
		Coffee c1 = new Coffee();
		c1.setName("아메리카노");
		c1.setPrice(3000);
		c1.printInfo();
		System.out.println("--------------");
		// 사람
		// 이름, 나이, 몸무게 출력
		
		Human h = new Human();
		h.setName("정다운");
		h.setAge(30);
//		h.setWeight(70);
		System.out.println(h.getName());
		h.printInfo();
		System.out.println("--------------");
		
		
		
	}
	
}










