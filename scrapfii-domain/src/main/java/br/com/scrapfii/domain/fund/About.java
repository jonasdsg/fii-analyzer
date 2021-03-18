package br.com.scrapfii.domain.fund;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public abstract class About implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CNPJ cnpj;
	private String name;
	private String site;
	private String negociationCode;
	
	public CNPJ getCnpj() {
		return cnpj;
	}
	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getNegociationCode() {
		return negociationCode;
	}
	public void setNegociationCode(String negociationCode) {
		this.negociationCode = negociationCode;
	}

	
}
