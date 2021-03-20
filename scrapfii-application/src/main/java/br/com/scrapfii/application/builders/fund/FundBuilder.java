package br.com.scrapfii.application.builders.fund;

import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.Contact;
import br.com.scrapfii.domain.fund.Fund;
import br.com.scrapfii.domain.fund.History;

public class FundBuilder {
	private Fund fund = new Fund();

	public static FundBuilder buider() {
		return new FundBuilder();
	}

	public FundBuilder withAbout(About about) {
		fund.setAbout(about);
		return this;
	}

	public FundBuilder withContact(Contact contact) {
		fund.setContact(contact);
		return this;
	}

	public FundBuilder withHistory(History history) {
		fund.setHistory(history);
		return this;
	}

	public Fund build() {
		return fund;
	}
}
