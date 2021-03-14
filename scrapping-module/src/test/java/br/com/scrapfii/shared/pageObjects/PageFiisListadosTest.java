package br.com.scrapfii.shared.pageObjects;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PageFiisListadosTest extends PageObjectTest {
	private static PageFiisListados fiisListados;
	
	@BeforeAll
	public static void setup() {
		fiisListados = new PageFiisListados(getWebDriverConfig()) ;
	}
	
	@BeforeEach
	public void beforeEach() throws Exception {
		fiisListados.goToMainPage();
		this.sleep(2);
	}
	
	@AfterEach
	public void afterEach() {
		fiisListados.close();
	}
	
	@Test 
	public void searchSomeFund() {
		assertNotNull(fiisListados.searchFor("AFOF"));
	}
	
	@Test
	public void selectTheLastOption() {
		fiisListados.selectTheLastOption();
	}

}
