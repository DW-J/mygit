package com.pius.may241.main;

import java.util.Scanner;

import com.pius.may241.calculator.Calculator;

// Java
// 		예외처리가 강제
// Python
//		처리하기 싫으면 안해도 됨(알아서 해줌)


public class EMain3 {
	public static void main(String[] args) {
		// 가격 / 무게(g)를 입력받아서 (정수로)
		// g당 가격이 얼마인지 값을 구해서 main에서 출력
		// 기능에 대한 것은 Class하나 열어서
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("가격(원) : ");
		int price = k.nextInt();
		System.out.print("무게(g) : ");
		int weight = k.nextInt();
		System.out.println("==================");
		
		int z1 = Calculator.divide(price, weight);
		System.out.printf("g당 가격은 : %d원\n", z1);
		
		try {
			int z2 = Calculator.divide2(price, weight);
			System.out.printf("g당 가격은 : %d원\n", z2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 다른 메소드에서 try - catch ? => 월권 행위 O / main메소드에서만 사용 !
		// throws : 이걸 더 맣이 사용! / main메소드 이외의 메소드에서 사용!
		
	}
}








