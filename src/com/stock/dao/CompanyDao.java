package com.stock.dao;

import java.util.List;

import com.stock.model.Company;

public interface CompanyDao 
{
	public void saveCompany(Company company);
	public List<Company> showCompanyList();
}
