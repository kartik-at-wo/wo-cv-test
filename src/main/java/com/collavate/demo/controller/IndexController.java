package com.collavate.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

	@RequestMapping("/")
	public ModelAndView frontend(){
	  return new ModelAndView("index.html");
	}
	
	@RequestMapping("/html/page1.html")
	public ModelAndView frontendpage1(){
	  return new ModelAndView("/html/page1.html");
	}
	
	@RequestMapping("/html/page2.html")
	public ModelAndView frontendpage2(){
	  return new ModelAndView("/html/page2.html");
	}
	
	@RequestMapping("/html/page3.html")
	public ModelAndView frontendpage3(){
	  return new ModelAndView("/html/page3.html");
	}
	
	@RequestMapping("/html/page4.html")
	public ModelAndView frontendpage4(){
	  return new ModelAndView("/html/page4.html");
	}
	
	@RequestMapping("/html/Test.html")
	public ModelAndView frontendpageTest(){
	  return new ModelAndView("/html/Test.html");
	}
	
	@RequestMapping("/Test.html")
	public ModelAndView frontendpageTest2(){
	  return new ModelAndView("/html/Test.html");
	}
}
