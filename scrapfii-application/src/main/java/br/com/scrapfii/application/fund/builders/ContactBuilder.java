package br.com.scrapfii.application.fund.builders;

import br.com.scrapfii.application.fund.ContactImpl;

public class ContactBuilder {

	private Long id;
	private String director;
	private String phone;
	private String address;
	private String bookKeeper;


	public static ContactBuilder builder() {
		return new ContactBuilder();
	}

	public ContactBuilder withDirector(String director) {
		this.director = director;
		return this;
	}
	
	public ContactBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public ContactBuilder withAddress(String address) {
		this.address = address;
		return null;
	}

	public ContactBuilder withBookKeeper(String bookKeeper) {
		this.bookKeeper = bookKeeper;
		return null;
	}

	public ContactBuilder withId(Long id) {
		this.id = id;
		return this;
	}

	public ContactImpl build() {
		return new ContactImpl(id, director, phone, address, bookKeeper);
	}
	
}
