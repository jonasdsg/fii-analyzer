package br.com.scrapfii.domain.fund;

public class Contact {
	protected String director;
	protected String phone;
	protected String address;
	protected String bookKeeper;
	
	public Contact(String director, String phone, String address, String bookKeeper) {
		super();
		this.director = director;
		this.phone = phone;
		this.address = address;
		this.bookKeeper = bookKeeper;
	}

	
}
