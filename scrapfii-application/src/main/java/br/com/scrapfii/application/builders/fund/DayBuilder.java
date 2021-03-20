package br.com.scrapfii.application.builders.fund;

import java.math.BigDecimal;

import br.com.scrapfii.domain.fund.Day;

public class DayBuilder {

	private Day day = new Day();

	public static DayBuilder builder() {
		return new DayBuilder();
	}

	public DayBuilder withFirst(String first) {
		day.setFirst(new BigDecimal(first));
		return this;
	}

	public DayBuilder withLast(String last) {
		day.setLast(new BigDecimal(last));
		return this;
	}

	public DayBuilder withAverage(String average) {
		day.setAverage(new BigDecimal(average));
		return this;
	}

	public DayBuilder withDayNumber(Integer dayNumber) {
		day.setDayNumber(dayNumber);
		return this;
	}

	public DayBuilder withMin(String min) {
		day.setMin(new BigDecimal(min));
		return this;
	}

	public DayBuilder withMax(String max) {
		day.setMax(new BigDecimal(max));
		return this;
	}

	public Day build() {
		return day;
	}

}
