package br.com.scrapfii.application.fund;

import java.util.List;

import br.com.scrapfii.application.builders.fund.AboutBuilder;
import br.com.scrapfii.application.shared.dto.AboutDTO;
import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.CNPJ;

public class AboutImpl extends About implements DefaultModelMethods<AboutDTO>{
	
	private Long id;

	public AboutImpl(Long id, CNPJ cnpj, String name, String site, List<String> negociationCodes) {
		super(cnpj, name, site, negociationCodes);
		this.id = id;
	}

	@Override
	public AboutDTO toDTO() {
		AboutDTO dto = new AboutDTO();
		dto.setId(id);
		dto.cnpj = this.cnpj.getCPNJ();
		dto.name = this.name;
		dto.site = this.site;
		dto.negociationCodes = this.negociationCodes;
		return dto;
	}

	public static AboutBuilder builder() {
		return new AboutBuilder();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
}
