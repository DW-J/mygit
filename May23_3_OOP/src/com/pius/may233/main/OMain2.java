// Java GUI프로그램 (Graphic User Interface)
// 종류는 AWT, Swing, JavaFX

// AWT : 자바 초창기에 나오 GUI 라이브러리
// 		운영체제(OS)에 따라서 모양이 다 달랐기 때문에, 종류도 상당히 제한적
// Swing : AWT 다음으로 등장한 라이브러리
//		윈도우 프로그램 - 자바로 만들지 X : 너무 느림, 더 최적화된 C언어라인이 있음!
//		윈도우 프로그램 잘 안만드는데... => 웹/앱 쪽으로 많이 넘어옴
//		- 결론적으로는 얘는 별로!, 디자인도 별로!
//		- Android App 구조 이해하는데 도움이 됨
// JavaFX : Swing의 느린 처리속도를 개선해서 출시됨
//		다양한 기능들도 추가 + 따로 외관 꾸미는것도 가능해짐
// 		여전히 웹/앱쪽에서 구현을 하면 되기 때문에... 그닥..!


package com.pius.may233.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.pius.may233.avengers.WinterSoldier;

public class OMain2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("지구");
		JButton jb = new JButton("김인간");
		jf.add(jb);
		
		// 윈터솔져 - actionPerformed()가 반드시 필요!
		//					(미완성된 메소드)
		
		// 윈터솔져 생성
		WinterSoldier wh = new WinterSoldier();
		
		// 김비버가 전담영웅으로 윈터솔져를 골랐음
		// 도움을 요청
		jb.addActionListener(wh);
		
		// 크기, 눈에 보이게
		jf.setSize(500, 500);
		jf.setVisible(true);
		
		
		
		
	}
}
