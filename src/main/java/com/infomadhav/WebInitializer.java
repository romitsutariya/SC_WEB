package com.infomadhav;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] config= {Config.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String[] paths={"/"};
		return paths; 
	}

}
