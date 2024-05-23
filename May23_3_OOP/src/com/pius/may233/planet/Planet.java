package com.pius.may233.planet;

import com.pius.may233.human.Human;

public class Planet {
	private String name;
	private int size;
	private boolean vision;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Planet(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isVision() {
		return vision;
	}
	
	public void setVision(boolean vision) {
		this.vision = vision;
	}
	
	public void add(Human h) {
		System.out.printf("%s에 %s이가 입주 !\n", name, h.getName());
	}
}
