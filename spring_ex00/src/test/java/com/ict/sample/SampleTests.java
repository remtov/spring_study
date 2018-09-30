package com.ict.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) //테스트를 실행할 클래스라는 뜻 // 스프링 실행역할 표시
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")//스프링이 시작되면서 어떤 설정을 읽어들여야 할지를 명시 // 어노테이션 속성값인 문자열 설정
@Log4j // 롬복을 이용한 로그를 기록하는 로거 생성(log4j.xml에서 설정)
public class SampleTests {
//스프링 모듈을 이용하여 간단하게 스프링을 가동시키는 곳 junit4.10이상 추천

	@Setter(onMethod_ = { @Autowired }) //온메서드는 추가할 메서드가 있을때 파라미터 어노테이션을 쓸때는 온파람을 쓴다.//세터는 세터메서드를 만든다 // 스프링으로부터 주입해달라는 표시
	private Restaurant restaurant;

	@Test
	public void textExist() {

		assertNotNull(restaurant);// 변수가 널이아니여야 성공이라는 뜻

		log.info(restaurant);
		log.info("--------------------------");
		log.info(restaurant.getChef());

	}

}

/*
 * 객채를 생성한적이없는데 객채가 만들어졌다. 롬복을 이용해서 레스토랑의 메서드들이 만들어졌다. 레스토랑객체에 셰프타입의 개게가 주입되었다.
 */
/*
 * 테스트 코드가 실행되기위해 프레임워크가 동작되고, 동작하는 과정에서 객체들이 스프링에 등록되고, 의존성주입이 필요한 객체는 자동으로 주입이
 * 이루어졌다.
 */