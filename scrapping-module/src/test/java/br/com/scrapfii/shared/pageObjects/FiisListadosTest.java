package br.com.scrapfii.shared.pageObjects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.scrapfii.application.configuration.ChromeDriverConfiguration;

public class FiisListadosTest {
	private static PageFiisListados fiisListados;
	
	@BeforeAll
	public static void setup() {
		fiisListados = new PageFiisListados(new ChromeDriverConfiguration());
	}
	
	@AfterEach
	public void afterEach() {
		fiisListados.close();
	}
	
	@Test 
	public void searchSomeFund() {
		fiisListados.searchFor("AFOF");
	}
	
	
}
