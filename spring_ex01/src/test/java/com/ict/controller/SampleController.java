package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;



@Controller
@RequestMapping("/sample/*") // 많이사용하는 어노테이션, 이클래스의 메서드들의 기본적인 경로가된다. /sample로 시작하는 모든 URL은 이컨트롤러로 동작된다.
@Log4j
public class SampleController {
	// 서블렛컨텍스트파일에 자동으로 빈으로 등록된다.

	@RequestMapping("")
	public void basic() {

		log.info("basic....................");
	} 

}
