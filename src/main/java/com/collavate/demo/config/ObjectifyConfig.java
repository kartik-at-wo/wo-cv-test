package com.collavate.demo.config;

import java.io.IOException;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.collavate.demo.pojo.User;
import com.googlecode.objectify.ObjectifyService;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Configuration
public class ObjectifyConfig {

    static {
        ObjectifyService.init();
        ObjectifyService.register(User.class); 
    }

    @Bean
    public FilterRegistrationBean<ObjectifyFilter> objectifyFilter() {
        FilterRegistrationBean<ObjectifyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ObjectifyFilter());
        registrationBean.addUrlPatterns("/*"); 
        return registrationBean;
    }

    public class ObjectifyFilter implements Filter {
        public void init(FilterConfig filterConfig) throws ServletException {
            // No initialization needed
        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            ObjectifyService.run(() -> {
                try {
                    try {
						chain.doFilter(request, response);
					} catch (IOException | ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                } finally {
                    // Clean up context if needed
                }
                return null; // ObjectifyService.run() requires a return value
            });
        }

        @Override
        public void destroy() {
            // No cleanup needed
        }
    }
}