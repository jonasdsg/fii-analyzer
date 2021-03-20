package br.com.scrapfii.application.builders.fund;

import java.util.List;

import br.com.scrapfii.domain.fund.Day;
import br.com.scrapfii.domain.fund.EnumMonth;
import br.com.scrapfii.domain.fund.InvalidMonthException;
import br.com.scrapfii.domain.fund.Month;

public class MonthBuilder {
	private Month month;

	public static MonthBuilder builder(EnumMonth month) {
		MonthBuilder mb = new MonthBuilder();
		mb.month = new Month(month);
		return mb;
	}

	public MonthBuilder withDays(List<Day> days) {
		if (month.getTotalDays() >= days.size()) {
			month.setDays(days);
			return this;
		}
		throw new InvalidMonthException("There is more days than expected!");
	}

	public Month build() {
		return month;
	}

}
