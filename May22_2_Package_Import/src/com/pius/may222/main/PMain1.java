package com.pius.may222.main;

import java.util.Scanner;

import com.pius.may222.product.Computer;
import com.pius.may222.product.Product;

public class PMain1 {
	public static void main(String[] args) {
		// 매직스테이션, 800000원, i5-1234, 8GB, 500GB 컴퓨터
		//출력
		Computer c = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
		c.printInfo();
		
		System.out.println("===========");
		
		// 멀티익스프레스, 500000원 스캐너
		// 출력
		Product p = new Product("멀티익스프레스", 500000);
		p.printInfo();
		System.out.println("===========");
		
		com.pius.may222.product.Scanner s
		= new com.pius.may222.product.Scanner("멀티익스프레스", 500000);
		s.printInfo();
		System.out.println("===========");
		
		
		
	}
}
