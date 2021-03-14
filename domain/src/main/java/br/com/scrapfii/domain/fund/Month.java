package br.com.scrapfii.domain.fund;

import java.util.List;

public abstract class Month {
	protected Integer monthNumber;
	protected Integer year;
	protected List<Day> days;
	
	public Month(Integer monthNumber,List<Day> days,Integer year) {
		this.validateMonth(monthNumber,days,year);
		this.monthNumber = monthNumber;
		this.days = days;
		this.year = year;
	}
	
	public void addDay(Day day) {
		this.days.add(day);
	}

	protected abstract void validateMonth(Integer monthNumber2, List<Day> days2, Integer year2);

	public Day getDay(Integer day) {
		return this.days.get(day);
	}
	
}
