package br.com.scrapfii.application.shared.dto;

public abstract class DTO <Model>{
	
	private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	public abstract Model toModel(); 
}
