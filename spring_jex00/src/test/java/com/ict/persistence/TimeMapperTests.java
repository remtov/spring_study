package com.ict.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.config.RootConfig;
import com.ict.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//디폴트시 //@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//java설정시
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class TimeMapperTests {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;

	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());

	}

	@Test
	public void testGetTime2() {

		log.info("getTime2");
		log.info(timeMapper.getTime2());

	}

}
