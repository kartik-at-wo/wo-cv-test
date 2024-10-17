package com.collavate.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.collavate.demo.entity.Company;
import com.collavate.demo.entity.User;
import com.collavate.demo.service.CompanyService;
import com.collavate.demo.service.ObjectifyDataAccessService;

@RestController
@RequestMapping("/api")
public class GCPController {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private ObjectifyDataAccessService dataAccessService;

	@PostMapping("/user/save")
	public User saveUserDetaile(@RequestBody User user) {
		System.out.println("Testing GCP DATASTORE");
		return dataAccessService.saveUser(user);
		//return dataAccessService.saveUserWithObjectify(user);
	}

	@PostMapping("/company/save")
	public Company saveCompanyDetailsDetaile(@RequestBody Company company) {
		return companyService.saveCompanyData(company);
	}
	
	@GetMapping("/company/getall")
	public List<Company> getAllCompanyDetailsDetaile() {
		return companyService.getAllCompanyDetails();
	}

	
}
