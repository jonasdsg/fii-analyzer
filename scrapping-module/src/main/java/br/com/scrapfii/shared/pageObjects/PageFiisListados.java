package br.com.scrapfii.shared.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.scrapfii.application.configuration.DefaultConfigurationDriver;

public class PageFiisListados extends PageObject{
	
	private static final String MAIN_PAGE_URL = "https://sistemaswebb3-listados.b3.com.br/fundsPage/7";
	private static final String SEARCH_INPUT = "//*[@id=\"palavrachave\"]";
	private static final String SEARCH_BUTTON = "//*[@id=\"divContainerIframeB3\"]/form/div[1]/div/div/div[1]/div/div[2]/button";
	private static final String FIRST_CARD = "//*[@id=\"nav-bloco\"]/div/div[1]/a/div";
	
	private final WebDriver browser;
	
	public PageFiisListados(DefaultConfigurationDriver configs) {
		super(configs);
		this.browser = super.getDriver();
	}

	public FundDetail searchFor(String foundCode) {
		this.goToMainPage();
		this.browser.findElement(By.xpath(SEARCH_INPUT)).sendKeys(foundCode);
		this.browser.findElement(By.xpath(SEARCH_BUTTON)).click();
		this.browser.findElement(By.xpath(FIRST_CARD)).click();
	
		return new FundDetail(this.getConfigs());
	}

	@Override
	public void goToMainPage() {
		this.browser.navigate().to(MAIN_PAGE_URL);
	}




}
