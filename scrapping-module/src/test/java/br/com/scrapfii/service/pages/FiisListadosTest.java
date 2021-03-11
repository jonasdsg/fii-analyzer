package br.com.scrapfii.service.pages;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FiisListadosTest {
	private static FiisListados fiisListados;
	
	@BeforeAll
	public static void setup() {
		fiisListados = new FiisListados();
	}
	
	@AfterEach
	public void afterEach() {
		this.fiisListados.close();
	}
	
	@Test 
	public void testaSeEstaBaixandoAListaDeFiis() {
		assertNotNull(fiisListados.getLista());
	}
	
	
}
