package com.pius.jun213.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameterNames().hasMoreElements()) {
			HJGameEngine.getHge().doHJ(request);
		} 
		request.getRequestDispatcher("HJ.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HJGameEngine.getHge().reset(request);
		request.getRequestDispatcher("HJ.jsp").forward(request, response);
	
	}

}
