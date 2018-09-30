package com.ict.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = { "com.ict.sample" })
@MapperScan(basePackages = { "com.ict.mapper" })
public class RootConfig {

	/* 마이바티스를 위한 추가로직 */

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		/* log4jdbc.log4j2 수정사안 */
//		hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");
//		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521:xe");
		/* log4jdbc.log4j2 수정사안 */

		hikariConfig.setUsername("ictu");
		hikariConfig.setPassword("12345678");

		HikariDataSource dataSource = new HikariDataSource(hikariConfig);

		return dataSource;

	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {

		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();

		sqlSessionFactory.setDataSource(dataSource());

		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

	/* 마이바티스를 위한 추가로직 */

}
