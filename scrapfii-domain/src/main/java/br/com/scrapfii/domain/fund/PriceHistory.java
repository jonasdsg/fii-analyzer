package br.com.scrapfii.domain.fund;

public abstract class PriceHistory {
	protected CNPJ cnpj;
	protected Month month;
	
	public PriceHistory(CNPJ cnpj, Month month) {
		this.validate(month);
		this.cnpj = cnpj;
		this.month = month;
	}

	public Day getDay(Integer day) {
		return this.month.getDay(day);
	}
	
	public String getCNPJ() {
		return this.cnpj.getCPNJ();
	}
	
	public abstract void validate(Month month);
}
