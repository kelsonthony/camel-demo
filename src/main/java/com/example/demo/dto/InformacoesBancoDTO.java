package com.example.demo.dto;

public class InformacoesBancoDTO {

	private String companyName;
	private String bankCode;
	private String liquidProfit;
	
	
	@Override
	public String toString() {
		return "InformacoesBancoDTO [companyName=" + companyName + ", bankCode=" + bankCode + ", liquidProfit="
				+ liquidProfit + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getLiquidProfit() {
		return liquidProfit;
	}
	public void setLiquidProfit(String liquidProfit) {
		this.liquidProfit = liquidProfit;
	}
	
	
	
	
	
	
}