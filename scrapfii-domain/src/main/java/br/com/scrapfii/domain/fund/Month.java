package br.com.scrapfii.domain.fund;

import static java.util.Collections.unmodifiableList;
import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
public class Month implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@OneToMany
	private List<Day> days;
	
	@Enumerated(STRING)
	private EnumMonth month;
	
	public Month(EnumMonth month) {
		this.month = month;
	}
	
	public List<Day> getDays() {
		return unmodifiableList(days);
	}
	
	public EnumMonth next() {
		return this.month;
	}
}
