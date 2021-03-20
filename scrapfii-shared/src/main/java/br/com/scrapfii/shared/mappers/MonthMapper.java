package br.com.scrapfii.shared.mappers;

import java.util.ArrayList;
import java.util.List;

import br.com.scrapfii.domain.fund.Day;
import br.com.scrapfii.domain.fund.Month;
import br.com.scrapfii.shared.dto.MonthDTO;

public class MonthMapper implements Mapper<Month, MonthDTO> {
	private DayMapper dayMapper = new DayMapper(); 
	
	@Override
	public MonthDTO mapperToDTO(Month model) {
		MonthDTO dto = new MonthDTO();
		dto.setId(model.getId());
		model.getDays().forEach(day-> dto.days.add(dayMapper.mapperToDTO(day)));
		dto.month = model.getMonth();
		
		return dto;
	}

	@Override
	public Month mapperToModel(MonthDTO dto) {
		Month model = new Month();
		List<Day> days = new ArrayList<Day>();
		
		model.setId(dto.getId());
		dto.days.forEach(day -> days.add(dayMapper.mapperToModel(day)));
		model.setDays(days);
		model.setMonth(dto.month);
		
		return model;
	}

}
