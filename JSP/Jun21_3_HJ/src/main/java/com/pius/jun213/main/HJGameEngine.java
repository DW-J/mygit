package com.pius.jun213.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class HJGameEngine {
	private int t;
	private int win;
	private int lose;
	private String pp;
	
	private static final HJGameEngine HGE = new HJGameEngine();
	
	public HJGameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public static HJGameEngine getHge() {
		return HGE;
	}


	public void doHJ(HttpServletRequest request) {
		
		int userAns = Integer.parseInt(request.getParameter("userAns"));
		
		int coin = new Random().nextInt(10) + 1;
		request.setAttribute("c", coin + "개");
		
		String gameAns = (coin % 2 == 0) ? "짝" : "홀";
		request.setAttribute("r", gameAns);
		if (userAns == (coin % 2)) {
			t++;
			win++;
		} else {
			t++;
			lose++;
		} 
		
		request.setAttribute("t", t + "전");
		request.setAttribute("w", win + "승");
		request.setAttribute("l", lose + "패");
		double p = (win / (double) t) * 100;
		pp = String.format("%.2f", p);
		request.setAttribute("p",  "(승률 : " + pp + "%)");
	}

	public void reset(HttpServletRequest request) {
		t= 0;
		win= 0;
		lose= 0;
		pp = "0";
		request.setAttribute("t", t + "전");
		request.setAttribute("w", win + "승");
		request.setAttribute("l", lose + "패");
		request.setAttribute("p",  "(승률 : " + pp + "%)");
		request.setAttribute("r", "전적 초기화 완료!");
		
	}
}




















