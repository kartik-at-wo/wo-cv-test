package com.collavate.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collavate.demo.pojo.User;
import com.collavate.demo.service.CompanyService;
import com.collavate.demo.service.ObjectifyDataAccessService;
import com.collavate.demo.serviceimpl.GCPDataStroreService;

@RestController
@RequestMapping("/api/objectify")
class ObjectifyController {


	@Autowired
	private GCPDataStroreService GCPDataStroreService;

	@PostMapping("/user/save")
	public User saveUserDetaile(@RequestBody User user) {
		System.out.println("Testing GCP DATASTORE");
		return GCPDataStroreService.saveUserWithObjectify(user);
	}
	
	@GetMapping("/user/getall")
	public List<User> egtAllUserDetaile() throws Exception {
		return GCPDataStroreService.findAllUserWithObjectify();
	}
}
