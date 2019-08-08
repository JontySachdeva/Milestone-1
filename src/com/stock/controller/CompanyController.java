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

import com.stock.model.Company;
import com.stock.model.Stock;
import com.stock.services.CompanyServices;
import com.stock.services.StockServices;

@Controller
public class CompanyController 
{
	@Autowired         
	private CompanyServices companyServices;

	public void setCompanyServices(CompanyServices companyServices) {
		this.companyServices = companyServices;
	}
	
	@Autowired
	
	private StockServices stockServices;

	public void setStockServices(StockServices stockServices) {
		this.stockServices = stockServices;
	}
	
	@RequestMapping("/")
	public String Ref() {
		return "Homepage";
	}
	@RequestMapping(value= {"/companysave","/stocksave"})/*owner is added  */
	public org.springframework.web.servlet.ModelAndView index()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("company", new Company());
		List<Company> list=companyServices.showCompanyList();
		mv.addObject("list",list);
		mv.addObject("stock", new Stock());
		List<Stock> stockList=stockServices.showStockList();
		mv.addObject("stockList",stockList);
		mv.setViewName("Admin");
		return mv;
	}
	
	@RequestMapping(value="/saveCompany",method = RequestMethod.POST)
	public String addCompany(@Valid @ModelAttribute("company") Company company,BindingResult result)
	{
		if(result.hasErrors())
		{
			return"Register";
		}
		else {
		companyServices.saveCompany(company);
		return "Homepage";
		}
	}
	
}
