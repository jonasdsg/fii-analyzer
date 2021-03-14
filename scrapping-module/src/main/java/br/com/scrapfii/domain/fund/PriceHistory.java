package br.com.scrapfii.domain.fund;

public class PriceHistory {
	protected CNPJ cnpj;
	protected Month month;
	
	public PriceHistory(CNPJ cnpj, Month month) {
		this.month = month;
		this.cnpj = cnpj;
	}
	
	public Day getDay(Integer day) {
		return this.month.getDay(day);
	}
	
	public String getCNPJ() {
		return this.cnpj.getCPNJ();
	}
}
