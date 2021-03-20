package br.com.scrapfii.shared.dto;

import java.util.List;

import br.com.scrapfii.domain.fund.EnumMonth;

public class MonthDTO extends DTO {
	public List<DayDTO> days;
	public EnumMonth month;
	
}
