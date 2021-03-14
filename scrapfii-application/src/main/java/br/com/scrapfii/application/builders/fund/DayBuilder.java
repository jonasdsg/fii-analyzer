package br.com.scrapfii.application.builders.fund;

import java.math.BigDecimal;

import br.com.scrapfii.application.fund.DayImpl;
import br.com.scrapfii.domain.fund.Day;

public class DayBuilder {
	
	private Long id;
	private Integer dayNumber;
	private String min;
	private String max;
	private String average;
	private String first;
	private String last;

	public static DayBuilder builder() {
		return new DayBuilder();
	}

	public Day build() {
		return new DayImpl(id, dayNumber, new BigDecimal(min), new BigDecimal(max),new BigDecimal(average),new BigDecimal(first),new BigDecimal(last));
	}

}
