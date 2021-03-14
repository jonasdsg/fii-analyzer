package br.com.scrapfii.shared.pageObjects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.scrapfii.application.configuration.ChromeDriverConfiguration;

public class PageFundDetailTest extends PageObjectTest {
	private static PageFundDetail fundDetail;
	
	@BeforeAll
	public static void setup() {
		PageFiisListados list = new PageFiisListados(getWebDriverConfig());
		list.goToMainPage();
		fundDetail =  list.searchFor("AFOF");
				//new PageFundDetail(new ChromeDriverConfiguration());
	}
	
	@BeforeEach
	public void beforeEach() {
	//	fundDetail.goToMainPage();
		this.sleep(10);
	}
	
	@AfterEach
	public void afterEach() {
		this.sleep(5);
		fundDetail.close();
	}
	
	@Test
	public void getCardsTest() {
		fundDetail.getCards().stream().forEach(div->{
			System.out.println(div.getText());
		});
	}
}
