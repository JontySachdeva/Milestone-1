package com.stock.services;

import java.util.List;

import com.stock.model.Stock;

public interface StockServices 
{
	public void saveStock(Stock stock);
	public List<Stock> showStockList();
}
