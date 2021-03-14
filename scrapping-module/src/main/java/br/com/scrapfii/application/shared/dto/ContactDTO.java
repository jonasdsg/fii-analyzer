package br.com.scrapfii.application.shared.dto;

import br.com.scrapfii.application.fund.ContactImpl;
import br.com.scrapfii.domain.fund.Contact;

public class ContactDTO extends DTO<Contact> {

	public String director;
	public String phone;
	public String address;
	public String bookKeeper;
	
	@Override
	public Contact toModel() {
		return new ContactImpl(director, phone, address, bookKeeper);
	}
	
}
