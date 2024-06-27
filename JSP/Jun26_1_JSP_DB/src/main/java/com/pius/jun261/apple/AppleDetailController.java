package com.pius.jun261.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppleDetailController")
public class AppleDetailController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (AppleDAO.getAppledao().getAppleDetail(request)) {
			request.setAttribute("contentPage", "apple/detail.jsp");
		} else {
			AppleDAO.getAppledao().getApples(request, 1);
			request.setAttribute("contentPage", "apple/apple.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DetailController
		// Update
		
		if (AppleDAO.getAppledao().update(request)) {
			AppleDAO.getAppledao().getApples(request, 1);
			request.setAttribute("contentPage", "apple/apple.jsp");
		} else {
			AppleDAO.getAppledao().getApples(request, 1);
			request.setAttribute("contentPage", "apple/apple.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
