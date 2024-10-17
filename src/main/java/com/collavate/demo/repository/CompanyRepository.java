package com.collavate.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collavate.demo.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
