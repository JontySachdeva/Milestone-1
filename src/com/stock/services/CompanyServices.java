package com.stock.services;

import java.util.List;

import com.stock.model.Company;

public interface CompanyServices 
{
	public void saveCompany(Company company);
	public List<Company> showCompanyList();
}
