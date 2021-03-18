package br.com.scrapfii.domain.fund;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
@Entity
public abstract class Day implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer dayNumber;
	private BigDecimal min;
	private BigDecimal max;
	private BigDecimal average;
	private BigDecimal first;
	private BigDecimal last;
	
	public Integer getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(Integer dayNumber) {
		this.dayNumber = dayNumber;
	}
	public BigDecimal getMin() {
		return min;
	}
	public void setMin(BigDecimal min) {
		this.min = min;
	}
	public BigDecimal getMax() {
		return max;
	}
	public void setMax(BigDecimal max) {
		this.max = max;
	}
	public BigDecimal getAverage() {
		return average;
	}
	public void setAverage(BigDecimal average) {
		this.average = average;
	}
	public BigDecimal getFirst() {
		return first;
	}
	public void setFirst(BigDecimal first) {
		this.first = first;
	}
	public BigDecimal getLast() {
		return last;
	}
	public void setLast(BigDecimal last) {
		this.last = last;
	}
	
	
}
