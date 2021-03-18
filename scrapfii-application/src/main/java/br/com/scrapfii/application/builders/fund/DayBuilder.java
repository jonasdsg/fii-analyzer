package br.com.scrapfii.application.builders.fund;

import java.math.BigDecimal;

import br.com.scrapfii.application.fund.DayEntity;
import br.com.scrapfii.domain.fund.Day;

public class DayBuilder {

	private Day day = new DayEntity();

	public static DayBuilder builder() {
		return new DayBuilder();
	}

	public void withFirst(String first) {
		day.setFirst(new BigDecimal(first));
	}

	public void withLast(String last) {
		day.setLast(new BigDecimal(last));
	}

	public void withAverage(String average) {
		day.setAverage(new BigDecimal(average));
	}

	public void with(Integer dayNumber) {
		day.setDayNumber(dayNumber);
	}

	public void withMin(String min) {
		day.setMin(new BigDecimal(min));
	}

	public void withMax(String max) {
		day.setMax(new BigDecimal(max));
	}

	public Day build() {
		return day;
	}

}
