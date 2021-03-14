package br.com.scrapfii.application.fund;

import br.com.scrapfii.application.shared.dto.ContactDTO;
import br.com.scrapfii.domain.fund.Contact;

public class ContactImpl extends Contact implements DefaultModelMethods<ContactDTO>{
	
	private Long id;

	public ContactImpl(Long id, String director, String phone, String address, String bookKeeper) {
		super(director, phone, address, bookKeeper);
		this.id = id;
	}
	
	@Override
	public ContactDTO toDTO() {
		return null;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}


	

}
