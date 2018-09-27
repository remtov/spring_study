//package com.ict.sp;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class ConfigTest {
//	
//	@Test
//	public void test() {
//		String path = "classpath:spring/application-config.xml";
//		ApplicationContext ac = new ClassPathXmlApplicationContext(path);
//		BasicDataSource bds =(BasicDataSource)ac.getBean("dataSource");
//		
//		int cnt= 0;
//		try (Connection con = bds.getConnection()){
//				
//			}
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		assertEquals(cnt,14);
//	}
//
//}
