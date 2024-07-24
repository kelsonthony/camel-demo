package com.example.demo.config;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class CamelConfig {
	
//	@Value("${camel-demo.api.path}")
//	String contextPath;
//	
//	@SuppressWarnings("rawtypes")
//	@Bean
//	ServletRegistrationBean servletRegistrationBean() {
//	    @SuppressWarnings("unchecked")
//		ServletRegistrationBean servlet = new ServletRegistrationBean
//	      (new CamelHttpTransportServlet(), contextPath+"/*");
//	    servlet.setName("CamelServlet");
//	    return servlet;
//	}

}
