package br.com.scrapfii.domain.fund;

import java.util.List;

public abstract class Month {
	protected Integer monthNumber;
	protected Integer year;
	protected List<Day> days;
		
	public void addDay(Day day) {
		this.days.add(day);
	}

	protected abstract void validateMonth(Integer monthNumber, List<Day> days, Integer year);

	public Day getDay(Integer day) {
		return this.days.get(day);
	}
	
}
