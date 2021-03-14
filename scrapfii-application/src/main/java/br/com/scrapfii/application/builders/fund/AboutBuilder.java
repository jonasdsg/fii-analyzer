package br.com.scrapfii.application.builders.fund;

import java.util.List;

import br.com.scrapfii.application.fund.AboutImpl;
import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.CNPJ;

public class AboutBuilder {
	private Long id;
	private CNPJ cnpj;
	private String name;
	private String site;
	private List<String> negociationCodes;
	
	public static AboutBuilder builder() {
		return new AboutBuilder();
	}
	
	public AboutBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	
	public AboutBuilder withCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public AboutBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public AboutBuilder withSite(String site) {
		this.site = site;
		return this;
	}
	
	public AboutBuilder withCodes(List<String> codes) {
		this.negociationCodes = codes;
		return this;
	}
	
	public About build() {
		return new AboutImpl(id, cnpj, name, site, negociationCodes);
	}
}
