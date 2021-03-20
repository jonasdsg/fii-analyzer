package br.com.scrapfii.domain.dto;

import java.util.List;

import br.com.scrapfii.domain.fund.EnumMonth;

public class MonthDTO extends DTO {
	public List<DayDTO> days;
	public EnumMonth month;
	
}
