package br.com.scrapfii.domain.fund;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;

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
public abstract class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	private String director;
	private String phone;
	private String address;
	private String bookKeeper;
	
}
