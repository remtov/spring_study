package com.ict.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 스프링 실행역할 표시
@ContextConfiguration(classes= {RootConfig.class}) // 어노테이션 속성값인 문자열 설정
@Log4j // 롬복을 이용한 로그를 기록하는 로거 생성(log4j.xml에서 설정)
public class SampleTests {
//스프링 모듈을 이용하여 간단하게 스프링을 가동시키는 곳 junit4.10이상 추천

	@Setter(onMethod_ = { @Autowired }) // 스프링으로부터 주입해달라는 표시
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