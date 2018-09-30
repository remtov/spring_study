package com.ict.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//디폴트시
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//java설정시
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class DataSourceTests {

	@Setter(onMethod_ = { @Autowired })
	private DataSource dataSource;

	@Setter(onMethod_ = { @Autowired })
	private SqlSessionFactory sqlSessionFactory;// 마이바티스 추가사안

	/* 마이바티스 수정사안 */
	@Test
	public void testMybatis() {

		try (SqlSession session = sqlSessionFactory.openSession(); Connection con = session.getConnection();) {

			log.info(con);
			log.info(session);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	/* 마이바티스 수정사안 */

	@Test
	public void testConnection() {

		try (Connection con = dataSource.getConnection()) {

			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
