package br.com.scrapfii.application.fund;

import java.math.BigDecimal;

import br.com.scrapfii.application.shared.dto.DayDTO;
import br.com.scrapfii.domain.fund.Day;

public class DayImpl extends Day implements DefaultModelMethods<DayDTO>{
	private Long id;

	public DayImpl(Long id, Integer dayNumber, BigDecimal min, BigDecimal max, BigDecimal average, BigDecimal first,
			BigDecimal last) {
		super(dayNumber, min, max, average, first, last);
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public DayDTO toDTO() {
		DayDTO dto = new DayDTO();
		dto.setId(id);
		dto.first = this.first.toString();
		dto.last = this.last.toString();
		dto.dayNumber = this.dayNumber;
		dto.min = this.min.toString();
		dto.max = this.max.toString();
		dto.average = this.average.toString();
		return dto;
	}

	@Override
	protected void validate(Integer dayNumber, BigDecimal min, BigDecimal max, BigDecimal average, BigDecimal first,
			BigDecimal last) {
		// TODO Auto-generated method stub
		
	}

}
