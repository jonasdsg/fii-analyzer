package br.com.scrapfii.domain.fund;

public abstract class PriceHistory {
	protected CNPJ cnpj;
	protected Month month;
	
	public Day getDay(Integer day) {
		return this.month.getDay(day);
	}
	
	public String getCNPJ() {
		return this.cnpj.getCPNJ();
	}
}
