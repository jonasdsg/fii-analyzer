package br.com.scrapfii.shared.mappers;

import br.com.scrapfii.domain.dto.YearDTO;
import br.com.scrapfii.domain.fund.Year;

public class YearMapper implements Mapper<Year, YearDTO> {
	private MonthMapper monthMapper = new MonthMapper();
	
	@Override
	public YearDTO mapperToDTO(Year model) {
		YearDTO dto = new YearDTO();
		dto.setId(model.getId());
		dto.yearNumber = model.getYearNumber();
		model.getMonths().forEach(month->dto.months.add(monthMapper.mapperToDTO(month)));
		
		return dto;
	}

	@Override
	public Year mapperToModel(YearDTO dto) {
		Year model = new Year(dto.yearNumber);
		model.setId(dto.getId());
		dto.months.forEach(month -> model.addMonth(monthMapper.mapperToModel(month)));
		return model;
	}

}
