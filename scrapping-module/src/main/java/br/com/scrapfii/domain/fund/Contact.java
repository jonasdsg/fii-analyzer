package br.com.scrapfii.domain.fund;

public class Contact {
	protected String Director;
	protected String Phone;
	protected String address;
	protected String bookKeeper;
	
	public Contact(String director, String phone, String address, String bookKeeper) {
		super();
		Director = director;
		Phone = phone;
		this.address = address;
		this.bookKeeper = bookKeeper;
	}

	
}
