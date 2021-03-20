package br.com.scrapfii.shared.mappers;

import br.com.scrapfii.domain.dto.ContactDTO;
import br.com.scrapfii.domain.fund.Contact;

public class ContactMapper implements Mapper<Contact, ContactDTO> {

	@Override
	public ContactDTO mapperToDTO(Contact model) {
		ContactDTO dto = new ContactDTO();
		dto.setId(model.getId());
		dto.address = model.getAddress();
		dto.bookKeeper = model.getBookKeeper();
		dto.director = model.getDirector();
		dto.phone = model.getPhone();
		
		return dto;
	}

	@Override
	public Contact mapperToModel(ContactDTO dto) {
		Contact model = new Contact();
		model.setId(dto.getId());
		model.setAddress(dto.address);
		model.setBookKeeper(dto.bookKeeper);
		model.setDirector(dto.director);
		model.setPhone(dto.phone);
		return model;
	}

}
