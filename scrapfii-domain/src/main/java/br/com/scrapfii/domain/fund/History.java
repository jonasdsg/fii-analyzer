package br.com.scrapfii.domain.fund;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode

@Entity
public class History implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String description;
	
	@OneToMany
	private List<Year> years;
	public History() {}
	public History(String description) {
		this.description = description;
		years = new ArrayList<Year>();
	}
	public void addYear(Year year) {
		this.years.add(year);
	}
}
