package br.com.scrapfii.shared.mappers;

import br.com.scrapfii.domain.fund.Fund;
import br.com.scrapfii.shared.dto.FundDTO;

public class FundMapper implements Mapper<Fund, FundDTO> {
	private AboutMapper aboutMapper = new AboutMapper();
	private ContactMapper contactMapper = new ContactMapper();
	private HistoryMapper historyMapper = new HistoryMapper();

	@Override
	public FundDTO mapperToDTO(Fund model) {
		FundDTO dto = new FundDTO();
		dto.setId(model.getId());
		dto.about = aboutMapper.mapperToDTO(model.getAbout());
		dto.contact = contactMapper.mapperToDTO(model.getContact());
		dto.history = historyMapper.mapperToDTO(model.getHistory());

		return dto;
	}

	@Override
	public Fund mapperToModel(FundDTO dto) {
		Fund model = new Fund();
		model.setId(dto.getId());
		model.setAbout(aboutMapper.mapperToModel(dto.about));
		model.setContact(contactMapper.mapperToModel(dto.contact));
		model.setHistory(historyMapper.mapperToModel(dto.history));
		return model;
	}

}
