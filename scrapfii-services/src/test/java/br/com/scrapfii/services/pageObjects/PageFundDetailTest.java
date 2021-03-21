package br.com.scrapfii.services.pageObjects;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.scrapfii.services.pageObjects.PageFiisListados;
import br.com.scrapfii.services.pageObjects.PageFundDetail;

public class PageFundDetailTest extends PageObjectTest {
	private static PageFundDetail fundDetail;
	
	@BeforeAll
	public static void setup() {
		PageFiisListados list = new PageFiisListados(getWebDriverConfig());
		list.goToMainPage();
		fundDetail =  list.searchFor("AFOF");
	}
	
	@BeforeEach
	public void beforeEach() {
		this.sleep(2);
	}
	
	@AfterAll
	public void afterEach() {
		fundDetail.close();
	}
	
	@Test
	public void getCardsTest() {
		fundDetail.getCards().stream().forEach(div->{
			System.out.println(div.getText());
		});
	}
	
	@Test
	public void getNameTest() {
		assertNotNull(fundDetail.getName());
	}
	
	@Test
	public void getCnpjTest() {
		assertNotNull(fundDetail.getCnpj());
	}
	
	@Test
	public void getAddressTest() {
		assertNotNull(fundDetail.getAdress());
	}
	
	@Test
	public void getPhoneTest() {
		assertNotNull(fundDetail.getPhone());
	}
	
	@Test
	public void getDepartmentTest() {
		assertNotNull(fundDetail.getDepartment());
	}
	
	@Test
	public void getBookKeeperDataTest() {
		assertNotNull(fundDetail.getBookKeeperData());
	}
	
	@Test
	public void getDirectorDataTest() {
		assertNotNull(fundDetail.getDirectorData());
	}
}
