package com.stock.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="company")
public class Company 
{
	public Company(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int companyCode;
	
	@NotEmpty
	@NotNull
	@Column(name="company_Name")
	private String companyName;
	
	@NotNull
	@Column(name="turnover")
	private int turnover;
	
	@NotEmpty
	@NotNull
	@Column(name="ceo")
	private String ceo;
	
	@NotEmpty
	@NotNull
	@Column(name="boardofdirectors")
	private String boardOfDirectors;
	
	@NotNull
	@Column(name="sector_id")
	private int sectorId;
	
	@NotEmpty
	@NotNull
	@Column(name="breifwriteup")
	private String breifWriteUp;
	
	@NotNull
	@Column(name="stock_Code")
	private int stockCode;


	


	public int getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	

	public int getTurnover() {
		return turnover;
	}


	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}


	public String getCeo() {
		return ceo;
	}


	public void setCeo(String ceo) {
		this.ceo = ceo;
	}


	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}


	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}


	


	public Integer getSectorId() {
		return sectorId;
	}


	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}


	public String getBreifWriteUp() {
		return breifWriteUp;
	}


	public void setBreifWriteUp(String breifWriteUp) {
		this.breifWriteUp = breifWriteUp;
	}


	


	public int getStockCode() {
		return stockCode;
	}


	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}


	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId
				+ ", breifWriteUp=" + breifWriteUp + ", stockCode=" + stockCode + "]";
	}


	public Company(int companyCode, String companyName, int turnover, String ceo, String boardOfDirectors,
			int sectorId, String breifWriteUp, int stockCode) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sectorId = sectorId;
		this.breifWriteUp = breifWriteUp;
		this.stockCode = stockCode;
	}
	
	
	
	
}
