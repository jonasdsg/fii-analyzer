package br.com.scrapfii.application.builders.fund;

import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.CNPJ;

public class AboutBuilder {
	private About about = new About();

	public static AboutBuilder builder() {
		return new AboutBuilder();
	}

	public AboutBuilder withCnpj(String cnpj) {
		about.setCnpj(new CNPJ(cnpj));
		return this;
	}

	public AboutBuilder withName(String name) {
		about.setName(name);
		return this;
	}

	public AboutBuilder withSite(String site) {
		about.setSite(site);
		return this;
	}

	public AboutBuilder withCodes(String code) {
		about.setNegociationCode(code);
		return this;
	}

	public About build() {
		return about;
	}
}
