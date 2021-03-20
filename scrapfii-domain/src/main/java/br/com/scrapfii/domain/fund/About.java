package br.com.scrapfii.domain.fund;

import static javax.persistence.GenerationType.IDENTITY;

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
public class About implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String cnpj;
	private String name;
	private String site;
	private String negociationCode;
	
	public About() {}
	
	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj.getCPNJ();
	}
}
