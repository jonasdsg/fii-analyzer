package br.com.scrapfii.domain.fund;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode

@Entity
public class Day implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	private Integer dayNumber;
	private BigDecimal min;
	private BigDecimal max;
	private BigDecimal average;
	private BigDecimal first;
	private BigDecimal last;	
	
}
