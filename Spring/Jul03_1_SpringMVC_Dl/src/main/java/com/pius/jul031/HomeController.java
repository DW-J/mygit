package com.pius.jul031;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pius.jul031.fruit.Fruit;
import com.pius.jul031.member.MemberDAO;

@Controller
public class HomeController {
	
	// Fruit 클래스 => 이름 / 가격
	@Autowired
	private Fruit f;
	
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println(f.getName());
		System.out.println(f.getPrice());
		System.out.println("-------------------");
		
		mDAO.test();
		
		return "home";
	}
	
}













