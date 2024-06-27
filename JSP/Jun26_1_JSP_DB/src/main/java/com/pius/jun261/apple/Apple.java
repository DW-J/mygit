package com.pius.jun261.apple;

public class Apple {
	// 약속
	// 자바 멤버변수의 이름과 DB에서 만든 컬럼의 이름을 동일하게 맞추기!!!
	// 더 나아가서 => jsp에서 활요할 요청 파라미터 이름을 하나로 사용할 것을 약속!!!
	
	private String a_location;
	private String a_color;
	private String a_flavor;
	private int a_price;
	private String a_introduce;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(String a_location, String a_color, String a_flavor, int a_price, String a_introduce) {
		super();
		this.a_location = a_location;
		this.a_color = a_color;
		this.a_flavor = a_flavor;
		this.a_price = a_price;
		this.a_introduce = a_introduce;
	}

	public String getA_location() {
		return a_location;
	}

	public void setA_location(String a_location) {
		this.a_location = a_location;
	}

	public String getA_color() {
		return a_color;
	}

	public void setA_color(String a_color) {
		this.a_color = a_color;
	}

	public String getA_flavor() {
		return a_flavor;
	}

	public void setA_flavor(String a_flavor) {
		this.a_flavor = a_flavor;
	}

	public int getA_price() {
		return a_price;
	}

	public void setA_price(int a_price) {
		this.a_price = a_price;
	}

	public String getA_introduce() {
		return a_introduce;
	}

	public void setA_introduce(String a_introduce) {
		this.a_introduce = a_introduce;
	}
	
	
	
}
