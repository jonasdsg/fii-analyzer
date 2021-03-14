package br.com.scrapfii.application.fund;

public interface DefaultModelMethods<ClassDTO> {

	public Long getId();
	public void setId(Long id);
	
	public ClassDTO toDTO();
}
