package com.stock.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="stock")
public class Stock 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stock_id")
	private int stockId;
	
	@NotEmpty
	@NotNull
	@Column(name="stock_name")
	private String stockName;
	
	@NotEmpty
	@NotNull
	@Column(name="contact_address")
	private String contactAddress;
	
	@NotEmpty
	@NotNull
	@Column(name="brief")
	private String brief;
	
	
	@NotEmpty
	@NotNull
	@Column(name="remarks")
	private String remarks;


	public int getStockId() {
		return stockId;
	}


	public void setStockId(int stockId) {
		this.stockId = stockId;
	}


	public String getStockName() {
		return stockName;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public String getContactAddress() {
		return contactAddress;
	}


	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}


	public String getBrief() {
		return brief;
	}


	public void setBrief(String brief) {
		this.brief = brief;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", contactAddress=" + contactAddress
				+ ", brief=" + brief + ", remarks=" + remarks + "]";
	}
	
	public Stock(){}
	
}
