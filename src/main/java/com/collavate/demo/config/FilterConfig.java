package com.collavate.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.googlecode.objectify.ObjectifyFilter;


@Configuration
public class FilterConfig {
/*
	@Bean
	public FilterRegistrationBean<ObjectifyFilter> objectifyFilter() {
		FilterRegistrationBean<ObjectifyFilter> registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new ObjectifyFilter());
		registrationBean.addUrlPatterns("/*"); // Apply the filter to all requests
		return registrationBean;
	} */
}
