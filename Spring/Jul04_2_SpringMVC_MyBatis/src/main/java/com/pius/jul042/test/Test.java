package com.pius.jul042.test;

import java.util.Date;

public class Test {
	private String t_title;
	private Date t_date;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(String t_title, Date t_date) {
		super();
		this.t_title = t_title;
		this.t_date = t_date;
	}

	public String getT_title() {
		return t_title;
	}

	public void setT_title(String t_title) {
		this.t_title = t_title;
	}

	public Date getT_date() {
		return t_date;
	}

	public void setT_date(Date t_date) {
		this.t_date = t_date;
	}

	
}
