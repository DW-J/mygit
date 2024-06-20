package com.pius.jun202.main;

public class Guest {
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String image;
	private String status;
	
	public Guest() {
		// TODO Auto-generated constructor stub
	}

	public Guest(String name, double height, double weight, double bmi, String image, String status) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.image = image;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
		
		
}
