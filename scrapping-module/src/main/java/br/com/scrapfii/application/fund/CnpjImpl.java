package br.com.scrapfii.application.fund;

import br.com.scrapfii.domain.fund.CNPJ;

public class CnpjImpl extends CNPJ implements DefaultModelMethods<String>{

	public CnpjImpl(String cnpj) {
		super(cnpj);
	}

	@Override
	protected String validarCNPJ(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toDTO() {
		return this.cnpj;
	}

}
