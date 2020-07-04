package pub.fii.model;

import java.util.ArrayList;
import java.util.List;

public class Fii {
	private String fiiNome;
	private	String fiiCode;
	List<Proventos> proventos = new ArrayList<Proventos>();
	
	public Fii() {}
	public Fii(String fiiNome,String fiiCode) {
		this.fiiNome = fiiNome;
		this.fiiCode = fiiCode;
	}
	
	public String getFiiNome() {
		return fiiNome;
	}
	public void setFiiNome(String fiiNome) {
		this.fiiNome = fiiNome;
	}
	public String getFiiCode() {
		return fiiCode;
	}
	public void setFiiCode(String fiiCode) {
		this.fiiCode = fiiCode;
	}
	public List<Proventos> getProventos() {
		return proventos;
	}
	public void setProventos(List<Proventos> proventos) {
		this.proventos = proventos;
	}
	
}
