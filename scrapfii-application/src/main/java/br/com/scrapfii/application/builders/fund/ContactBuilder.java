package br.com.scrapfii.application.builders.fund;

import br.com.scrapfii.domain.fund.Contact;

public class ContactBuilder {
	private Contact	 contact = new Contact();

	public static ContactBuilder builder() {
		return new ContactBuilder();
	}

	public ContactBuilder withDirector(String director) {
		contact.setDirector(director);
		return this;
	}
	
	public ContactBuilder withPhone(String phone) {
		contact.setPhone(phone);
		return this;
	}

	public ContactBuilder withAddress(String address) {
		contact.setAddress(address);
		return this;
	}

	public ContactBuilder withBookKeeper(String bookKeeper) {
		contact.setBookKeeper(bookKeeper);
		return this;
	}

	public Contact build() {
		return contact;
	}
	
}
