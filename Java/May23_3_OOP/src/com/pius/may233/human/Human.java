package com.pius.may233.human;

import com.beaver.may233.Avengers.Avengers;
import com.pius.may233.avengers.Ironman;

public class Human {
	private String name;
	private Avengers hero;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(String name) {
		super();
		this.name = name;
		System.out.println("제 이름은 " + name + ", 인간이죠.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Avengers a) {
		hero = a;
		System.out.println("ㄷㄱㄷㄱㄷㄱ");
	}
	
	public void helpAaaaaa() {
		hero.attack();
	}
	

}
