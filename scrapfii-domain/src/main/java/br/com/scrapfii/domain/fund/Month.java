package br.com.scrapfii.domain.fund;

import static java.util.Collections.unmodifiableList;
import static javax.persistence.EnumType.STRING;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public abstract class Month implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private List<Day> days;
	
	@Enumerated(STRING)
	private EnumMonth month;
	
	public Month(EnumMonth month) {
		this.validateMonth(month);
		this.month = month;
	}


	public String getMonth() {
		return month.name();
	}

	public void addDays(List<Day> days) {
		this.days = days;
	}
	
	public List<Day> getDays() {
		return unmodifiableList(days);
	}
	
	protected abstract void validateMonth(EnumMonth month);
	
}
