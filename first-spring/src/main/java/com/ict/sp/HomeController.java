package com.ict.sp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)//jsp에서 들어온 요청에 해당하는 비지니스 로직을 찾아준다
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );//비지니스 로직에서 수행결과를 화면으로 보내준다. 서버타임이라는 이름으로 포맷드데이트를 전송한다는 의미이다.
		
		return "home";//서블릿컨텍스트를 거쳐서 webinf와 .jsp가 붙는다. //수행결과에대한 응답을 어디로보낼지 명시 "home.jsp 로 간다는 뜻이다.
		
	}
	
}
