package com.collavate.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebSecurityConfiguration  implements WebMvcConfigurer {
	@SuppressWarnings("deprecation")
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.cors().disable()
//                .csrf().disable()
//                .authorizeHttpRequests().requestMatchers("/api/**", "/static/**").permitAll().and()
//                .build();
        
       return http
        .authorizeRequests()
            .requestMatchers("/api/**", "/static/**","/**", "/html/**", "/js/**", "/css/**").permitAll() // Allow access to static resources
            .anyRequest().authenticated()
            .and()
        .csrf().disable().build();
    }
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//	    registry.addViewController("/static").setViewName("forward:/index.html");
//	}
//	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //.allowedOrigins("http://localhost:8080")
                .allowedMethods("*");
    }
}