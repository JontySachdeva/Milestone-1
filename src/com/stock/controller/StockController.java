package com.stock.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stock.model.Stock;
import com.stock.services.StockServices;

@Controller
public class StockController 
{
	@Autowired
	
	private StockServices stockServices;

	public void setStockServices(StockServices stockServices) {
		this.stockServices = stockServices;
	}
	
	@RequestMapping("/stocksave")
	public org.springframework.web.servlet.ModelAndView index()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("stock", new Stock());
		List<Stock> stockList=stockServices.showStockList();
		mv.addObject("stockList",stockList);
		mv.setViewName("Admin");
		return mv;
	}
	
	@RequestMapping(value="/saveStock",method = RequestMethod.POST)
	public String addCompany(@Valid @ModelAttribute("stock") Stock stock,BindingResult result)
	{
		if(result.hasErrors())
		{
			return"Admin";
		}
		else 
		{
			stockServices.saveStock(stock);;
			return "NewFile";
		}
	}
	
}
