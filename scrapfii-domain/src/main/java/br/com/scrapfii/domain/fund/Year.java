package br.com.scrapfii.domain.fund;

import static java.util.Collections.unmodifiableList;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class Year implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer yearNumber;
	@ManyToOne
	private List<Month> months;
	
	public Integer getYearNumber() {
		return yearNumber;
	}
	public void setYearNumber(Integer yearNumber) {
		this.yearNumber = yearNumber;
	}
	public List<Month> getMonths() {
		return unmodifiableList(months);
	}
	public Month getMonth(Integer monthNumber) {
		return months.get(monthNumber);
	}
	
	public void addMonths(List<Month> months) {
		this.months = months;
	}
	
	
}
