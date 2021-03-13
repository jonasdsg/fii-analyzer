package br.com.scrapfii.shared.pageObjects;

import org.openqa.selenium.WebDriver;

import br.com.scrapfii.application.configuration.DefaultConfigurationDriver;

public class FundDetail extends PageObject {
	private static final String MAIN_PAGE_URL = "";
	private WebDriver browser;
	
	public FundDetail(DefaultConfigurationDriver configs) {
		super(configs);
		this.browser = configs.getDriver(); 
	}

	@Override
	public void goToMainPage() {
		this.browser.navigate().to(MAIN_PAGE_URL);
	}



}
