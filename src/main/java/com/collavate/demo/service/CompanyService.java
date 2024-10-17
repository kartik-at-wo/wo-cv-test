package com.collavate.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.collavate.demo.entity.Company;


public interface CompanyService {
	
	public List<Company> getAllCompany();

	Company saveCompanyData(Company company);
	
	List<Company> getAllCompanyDetails();
}
