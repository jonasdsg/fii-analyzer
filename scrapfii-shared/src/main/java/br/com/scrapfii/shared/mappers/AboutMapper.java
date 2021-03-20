package br.com.scrapfii.shared.mappers;

import br.com.scrapfii.domain.fund.About;
import br.com.scrapfii.domain.fund.CNPJ;
import br.com.scrapfii.shared.dto.AboutDTO;

public class AboutMapper implements Mapper<About, AboutDTO> {

	@Override
	public AboutDTO mapperToDTO(About model) {
		
		AboutDTO dto = new AboutDTO();
		dto.setId(model.getId());
		dto.cnpj = model.getCnpj();
		dto.name = model.getName();
		dto.negociationCode = model.getNegociationCode();
		dto.site = model.getSite();
		
		return dto;
	}

	@Override
	public About mapperToModel(AboutDTO dto) {
		About model = new About();
		model.setId(dto.getId());
		model.setCnpj(new CNPJ(dto.cnpj));
		model.setName(dto.name);
		model.setNegociationCode(dto.negociationCode);
		model.setSite(dto.site);
		
		return model;
	}

}
