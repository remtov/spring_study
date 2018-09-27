package com.ict.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ict.sp.service.TestService;

@Controller
public class TestController {

	/*
	 * // 이거안써놓으면 다된다 <context:component-scan base-package="com.ict.sp" />
	 * <mvc:annotation-driven /> 이거써놓으면 앞뒤에 필요한게 붙는다 웹아이엔에프와 쩜제이에스피 선행학습 자바 jsp 내가
	 * 하던걸 스프링이 할수있도록 세팅만해주면된다.
	 */
	@Autowired
	private TestService ts;

	@RequestMapping(value = "/test", method = RequestMethod.GET) // 예를 쓰고mvc컨피그에 //예는 겟만 된다.
	public String test(Model m) {
		m.addAttribute("list", ts.getList());// JSTL El테그로 뷰에서 가져올수있다.
		// 그러기위해선 해야할것이 많았다 서블렛과정 그작업을 스프링이한다.

		return "test";

	}
}
