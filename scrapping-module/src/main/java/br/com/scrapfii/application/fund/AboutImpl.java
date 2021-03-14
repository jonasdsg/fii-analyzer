package br.com.scrapfii.application.fund;

import java.util.List;

import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.CNPJ;

public class AboutImpl extends About {

	public AboutImpl(CNPJ cnpj, String name, String site, List<String> negociationCodes) {
		super(cnpj, name, site, negociationCodes);
	}

}
