package br.com.scrapfii.domain.fund;

import java.util.List;

public abstract class About {

	protected CNPJ cnpj;
	protected String name;
	protected String site;
	protected List<String> negociationCodes;
	
	public About(CNPJ cnpj, String name, String site, List<String> negociationCodes) {
		super();
		this.cnpj = cnpj;
		this.name = name;
		this.site = site;
		this.negociationCodes = negociationCodes;
	}
	
}
