package br.com.scrapfii.application.shared.dto;

public abstract class DTO<ModelClass> implements DtoMapper<ModelClass>{
	
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	 
}
