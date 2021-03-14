package br.com.scrapfii.application.shared.dto;

import java.util.List;

import br.com.scrapfii.application.fund.AboutImpl;
import br.com.scrapfii.application.fund.CnpjImpl;
import br.com.scrapfii.domain.fund.About;

public class AboutDTO extends DTO<About>{
	
	public String cnpj;
	public String name;
	public String site;
	public List<String> negociationCodes;
	
	@Override
	public About toModel() {
		return new AboutImpl(new CnpjImpl(cnpj),name,site,negociationCodes);
	}
}
