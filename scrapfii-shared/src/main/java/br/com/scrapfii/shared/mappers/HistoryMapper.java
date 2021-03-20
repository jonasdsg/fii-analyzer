package br.com.scrapfii.shared.mappers;

import br.com.scrapfii.domain.fund.History;
import br.com.scrapfii.shared.dto.HistoryDTO;

public class HistoryMapper implements Mapper<History, HistoryDTO> {
	private YearMapper yearMapper = new YearMapper();
	
	@Override
	public HistoryDTO mapperToDTO(History model) {
		HistoryDTO dto = new HistoryDTO();
		dto.setId(model.getId());
		dto.description = model.getDescription();
		model.getYears().forEach(year -> dto.years.add(yearMapper.mapperToDTO(year)));
		return dto;
	}

	@Override
	public History mapperToModel(HistoryDTO dto) {
		History model = new History(dto.description);
		model.setId(dto.getId());
		dto.years.forEach(year -> model.addYear(yearMapper.mapperToModel(year)));
		
		return model;
	}

}
