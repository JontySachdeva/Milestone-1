package com.stock.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.dao.StockDao;
import com.stock.model.Stock;

@Service
public class StockServicesImpl implements StockServices 
{
	@Autowired
	
	private StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Override
	public void saveStock(Stock stock) {
		stockDao.saveStock(stock);
		
	}

	@Override
	public List<Stock> showStockList() {
		return stockDao.showStockList();
	}

}
