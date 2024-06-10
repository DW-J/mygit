package com.dawoon.may291.main;

import java.util.HashMap;
import java.util.Scanner;

import com.dawoon.may291.student.Student;

public class CMain3 {
	public static void main(String[] args) {
		// 학생의 이름을 입력했을 때
		// 그 학생의 전체 정보를 출력하고 싶음
		
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("ㅋㅋ", new Student("ㅋㅋ", 30, 20, 10));
		students.put("ㅎㅎ", new Student("ㅎㅎ", 70, 50, 30));
		students.put("ㅇㅇ", new Student("ㅇㅇ", 40, 50, 60));
		students.put("ㅁㅁ", new Student("ㅁㅁ", 50, 80, 20));
		
		// 입력한 학생이름의 전체 정보를 출력
		students.get(name).printInfo();
		
		
	}
	
}
