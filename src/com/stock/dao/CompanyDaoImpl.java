package com.stock.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stock.model.Company;
@Repository
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	@Transactional
	public void saveCompany(Company company) {
		sessionFactory.getCurrentSession().save(company);
	}


	@Transactional
	@SuppressWarnings("unchecked")
	public List<Company> showCompanyList() {
		List<Company> list=sessionFactory.getCurrentSession().createQuery("from Company").list();
		return list;
	}
	
	

}
