package com.pius.may225.avengers;


import com.pius.may225.avengers.Avengers;
import com.pius.may225.driver.Driver;
import com.pius.may225.smoker.Smoker;

public class Ironman extends Avengers implements Smoker,Driver {
	int property;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int property) {
		super(name, age);
		this.property = property;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(property);
	}
	
	@Override
	public void attack() {
		System.out.println("헐크버스터 출격!");
	}
	
	@Override
	public void smoke() {
		System.out.println("난 쿠바산 시가만 핀다구");
	}
	
	@Override
	public void drive() {
		System.out.println("날으는게 빠르지만 비싼차 탄는게 더 쌈@뽕함s");
	}
	
}
