package br.com.scrapfii.application.fund;

import br.com.scrapfii.domain.fund.CNPJ;

public class CnpjImpl extends CNPJ implements DefaultModelMethods<String>{
	private Long id;

	public CnpjImpl(Long id,String cnpj) {
		super(cnpj);
		this.id = id;
	}

	@Override
	protected String validarCNPJ(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toDTO() {
		return this.cnpj;
	}

}
