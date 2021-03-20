package br.com.scrapfii.domain.fund;

import static java.util.regex.Pattern.matches;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CNPJ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	private String cnpj;

	public CNPJ() {	}
	
	public CNPJ(String cnpj) {
		this.cnpj = this.validarCNPJ(cnpj);
	}

	public String getCPNJ() {
		return this.cnpj;
	}

	public Long getId() {
		return this.id;
	}

	private String validarCNPJ(String cnpj) {
		String pattern = "[0-9]{2,3}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}-[0-9]{2}";
		if (matches(pattern, cnpj)) {
			return cnpj;
		}
		throw new InvalidCNPJ("Invalid cnpj format");
	}
}
