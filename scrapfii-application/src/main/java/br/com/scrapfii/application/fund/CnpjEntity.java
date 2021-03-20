package br.com.scrapfii.application.fund;

import br.com.scrapfii.domain.fund.CNPJ;

public class CnpjEntity extends CNPJ {
	private Long id;
	private static final long serialVersionUID = 1L;

	public CnpjEntity(String cnpj) {
		super(cnpj);
	}
	
	@Override
	protected String validarCNPJ(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getId() {
		return id;
	}

}
