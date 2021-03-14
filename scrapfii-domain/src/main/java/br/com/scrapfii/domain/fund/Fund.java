package br.com.scrapfii.domain.fund;

public class Fund {
	
	protected CNPJ cnpj; 
	protected About data;
	protected Contact contact;
	protected PriceHistory fundPricesHistory;

	public Fund(CNPJ cnpj, About data, Contact contact, PriceHistory fundPricesHistory) {
		this.cnpj = cnpj;
		this.data = data;
		this.contact = contact;
		this.fundPricesHistory = fundPricesHistory;
	}
	
	
}
