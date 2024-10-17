package com.collavate.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collavate.demo.entity.Company;
import com.collavate.demo.repository.CompanyRepository;
import com.collavate.demo.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public List<Company> getAllCompany() {
		 return companyRepository.findAll();
	}

	@Override
	public Company saveCompanyData(Company company) {
		System.out.println("## => "+company);
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllCompanyDetails() {
		return companyRepository.findAll();
	}
}
