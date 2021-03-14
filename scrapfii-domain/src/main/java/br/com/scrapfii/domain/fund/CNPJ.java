package br.com.scrapfii.domain.fund;

public abstract class CNPJ {
	protected String cnpj;
	
	public CNPJ(String cnpj) {
		this.cnpj = this.validarCNPJ(cnpj);
	}
	
	public String getCPNJ() {
		return this.cnpj;
	}
	
	protected abstract String validarCNPJ(String cnpj);
}
