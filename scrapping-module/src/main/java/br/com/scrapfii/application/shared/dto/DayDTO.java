package br.com.scrapfii.application.shared.dto;

import br.com.scrapfii.application.fund.builders.DayBuilder;
import br.com.scrapfii.domain.fund.Day;

public class DayDTO extends DTO<Day>{
	
	public Integer dayNumber;
	public String min;
	public String max;
	public String average;
	public String first;
	public String last;
	
	@Override
	public Day toModel() {
		return DayBuilder.builder().build();
	}
	
}
