package br.com.scrapfii.shared.mappers;

public interface Mapper<Model, Dto> {
	public Dto mapperToDTO(Model model);
	public Model mapperToModel(Dto dto);
}
