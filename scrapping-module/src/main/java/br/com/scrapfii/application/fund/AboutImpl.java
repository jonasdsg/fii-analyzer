package br.com.scrapfii.application.fund;

import java.util.List;

import br.com.scrapfii.application.shared.dto.AboutDTO;
import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.CNPJ;

public class AboutImpl extends About implements ImplementationMapper<AboutDTO> {
	private Long id;
	
	public AboutImpl(CNPJ cnpj, String name, String site, List<String> negociationCodes) {
		super(cnpj, name, site, negociationCodes);
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

}
