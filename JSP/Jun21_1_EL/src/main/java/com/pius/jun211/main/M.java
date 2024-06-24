package com.pius.jun211.main;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class M {
	public static void multiply(HttpServletRequest request) {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x * y;
		request.setAttribute("z", z);
		
		Pius p = new Pius("비오", 3, 50.5, 10.1);
		request.setAttribute("p", p);
		
		ArrayList<Pius> pio = new ArrayList<Pius>();
		pio.add(p);
		pio.add(new Pius("뷔오", 2, 40.4, 9.4));
		pio.add(new Pius("뷔워", 5, 30.3, 6.6));
		pio.add(new Pius("비워", 1, 55.5, 3.3));
		request.setAttribute("pio", pio);
	}
}
