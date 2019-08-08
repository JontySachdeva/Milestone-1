package com.stock.dao;

import java.util.List;

import com.stock.model.Stock;

public interface StockDao 
{
	public void saveStock(Stock stock);
	public List<Stock> showStockList();
}
