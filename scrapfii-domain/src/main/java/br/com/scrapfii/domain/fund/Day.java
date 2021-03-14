package br.com.scrapfii.domain.fund;

import java.math.BigDecimal;

public abstract class Day {
	protected Integer dayNumber;
	protected BigDecimal min;
	protected BigDecimal max;
	protected BigDecimal average;
	protected BigDecimal first;
	protected BigDecimal last;
	
	public Day(Integer dayNumber, BigDecimal min, BigDecimal max, BigDecimal average, BigDecimal first,
			BigDecimal last) {
		this.validate(dayNumber, min, max, average, first, last);
		
		this.dayNumber = dayNumber;
		this.min = min;
		this.max = max;
		this.average = average;
		this.first = first;
		this.last = last;
	}
	
	protected abstract void validate(Integer dayNumber, BigDecimal min, BigDecimal max, BigDecimal average, BigDecimal first,
			BigDecimal last);
}
