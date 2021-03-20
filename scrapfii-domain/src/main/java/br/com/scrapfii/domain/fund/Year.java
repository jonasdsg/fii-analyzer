package br.com.scrapfii.domain.fund;

import static java.util.Collections.unmodifiableList;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Year implements Serializable {
	private static final long serialVersionUID = 1L;
	private static EnumMonth nextMonth;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	private Integer yearNumber;
	@OneToMany
	private List<Month> months;
	
	public Year() {	}
	
	public Year(Integer yearNumber) {
		nextMonth = EnumMonth.JANUARY;
		months = new ArrayList<Month>();
 		this.yearNumber = yearNumber;
	}

	public List<Month> getMonths() {
		return unmodifiableList(months);
	}
	
	public Integer getYearNumber() {
		return yearNumber;
	}
	
	public Month getMonth(Integer monthNumber) {
		return months.get(monthNumber);
	}
	
	public void addMonth(Month month) {
		if(nextMonth == month.next()) {
			months.add(month);
		}
		else {
			throw new InvalidMonthException("");
		}
	}
	
	
}
