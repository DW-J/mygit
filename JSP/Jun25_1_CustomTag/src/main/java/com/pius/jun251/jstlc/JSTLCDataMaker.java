package com.pius.jun251.jstlc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class JSTLCDataMaker {
	public static void make(HttpServletRequest request) {
		int[] ar = { 123, 456, 78, 91, 234};
		request.setAttribute("ar", ar);
		
		ArrayList<Pius> al = new ArrayList<Pius>();
		al.add(new Pius("비오", 3, 50.5, 10.1));
		al.add(new Pius("비우", 2, 40.4, 9.9));
		al.add(new Pius("뷔오", 5, 30.3, 6.6));
		al.add(new Pius("뷔워", 1, 10.1, 3.3));
		request.setAttribute("al", al);
	}
}
