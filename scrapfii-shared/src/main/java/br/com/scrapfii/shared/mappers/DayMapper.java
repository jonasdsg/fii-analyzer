package br.com.scrapfii.shared.mappers;

import br.com.scrapfii.domain.fund.Day;
import br.com.scrapfii.shared.dto.DayDTO;

public class DayMapper implements Mapper<Day, DayDTO> {

	@Override
	public DayDTO mapperToDTO(Day model) {
		DayDTO dto = new DayDTO();

		dto.setId(model.getId());
		dto.first = model.getFirst();
		dto.min = model.getMin();
		dto.average = model.getAverage();
		dto.max = model.getMax();
		dto.last = model.getLast();
		dto.dayNumber = model.getDayNumber();

		return dto;
	}

	@Override
	public Day mapperToModel(DayDTO dto) {
		Day model = new Day();
		
		model.setId(dto.getId());
		model.setFirst(dto.first);
		model.setMin(dto.min);
		model.setAverage(dto.average);
		model.setMax(dto.max);
		model.setLast(dto.last);
		model.setDayNumber(dto.dayNumber);
		
		return model;
	}

}
