package com.stock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.dao.CompanyDao;
import com.stock.model.Company;
@Service
public class CompanyServicesImpl implements CompanyServices {
	@Autowired
	private CompanyDao companyDao;
	
	

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}



	@Override
	public void saveCompany(Company company) {
		companyDao.saveCompany(company);
	}



	@Override
	public List<Company> showCompanyList() {
		return companyDao.showCompanyList();
	}

}
