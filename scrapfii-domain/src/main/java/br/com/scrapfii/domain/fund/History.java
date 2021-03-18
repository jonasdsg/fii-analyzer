package br.com.scrapfii.domain.fund;

import static java.util.Collections.unmodifiableList;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class History implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CNPJ cnpj;
	@ManyToOne
	private List<Year> years;
	
	public String getCNPJ() {
		return this.cnpj.getCPNJ();
	}
	
	public void changeCNPJ(CNPJ cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<Year> getYears() {
		return unmodifiableList(years);
	}
	
	public Year getYear(Integer yearNumber) {
		return years.get(yearNumber);
	}
	
	public void addYear(Year year) {
		years.add(year);
	}
}
