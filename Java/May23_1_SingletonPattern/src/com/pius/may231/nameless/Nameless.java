package com.pius.may231.nameless;

public class Nameless {
	private String name;
	private int age;
	private String nickname;
	
	private static final Nameless NAMELESS = new Nameless("미샤", 68, "시계공");
	
	public static Nameless getNameless() {
		return NAMELESS;
	}

	public Nameless() {
		// TODO Auto-generated constructor stub
	}

	public Nameless(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
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

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}
}
