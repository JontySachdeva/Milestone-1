package com.stock.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stock.model.Stock;

@Repository
public class StockDaoImpl implements StockDao {
	@Autowired
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	@Transactional
	public void saveStock(Stock stock) {
		sessionfactory.getCurrentSession().save(stock);
		
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Stock> showStockList() {
		List<Stock> stockList=sessionfactory.getCurrentSession().createQuery("from Stock").list();
		return stockList;
	}

}
