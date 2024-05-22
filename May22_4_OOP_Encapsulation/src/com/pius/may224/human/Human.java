package com.pius.may224.human;

// 캡슐화 (Encapsulation)
//		멤버변수에 접근할 수 있는 통로! 를 만들고 그 통로에 안전장치를 하는 개념
//		즉! 외부에 노출할 필요가 없는 정보들을 캡슐처럼 감싸서 '은닉'하는 기능

public class Human {
	private String name;		// 변수들의 외부 노출을 제한하기 위한 private
	private int age;			
	private double weight;		
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age/*, double weight*/) { 
		super();
		this.name = name;
		this.age = age;
//		this.weight = weight; // 몸무게 공개는 부끄러우니까;;;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// setXXX : 외부의 접근이 제한된 XXX를 가공할 수 있음
	// 나이에는 음수가 없으니...
	public void setAge(int age) {
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
//		System.out.println(weight);
	}
}
