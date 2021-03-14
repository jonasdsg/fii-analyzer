package br.com.scrapfii.shared.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.scrapfii.application.configuration.DefaultWebDriverConfiguration;

public class PageFundDetail extends PageObject {
	private static final String MAIN_PAGE_URL = "";
	private static final String DIV_CARDS_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[1]";
	private static final String CARDS_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div/div/div/div";
	private WebDriver browser;
	
	public PageFundDetail(DefaultWebDriverConfiguration configs) {
		super(configs);
		this.browser = configs.getDriver(); 
	}

	@Override
	public void goToMainPage() {
		this.browser.navigate().to(MAIN_PAGE_URL);
	}

	public List<WebElement> getCards() {
		WebElement div = this.browser.findElement(By.xpath(DIV_CARDS_PATH));
		List<WebElement> cards = div.findElements(By.xpath(CARDS_PATH));
		return cards;
	}



}
