package com.ict.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { ServletConfig.class };/* 서블렛컨텍스트를 대신하는 녀석 */
	}

	@Override
	protected String[] getServletMappings() {
		//
		return new String[] { "/" };//기본루트경로를 비워준다.
	}

}
