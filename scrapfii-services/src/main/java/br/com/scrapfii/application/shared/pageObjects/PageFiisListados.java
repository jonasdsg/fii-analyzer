package br.com.scrapfii.application.shared.pageObjects;
import static org.openqa.selenium.By.tagName;
import static org.openqa.selenium.By.xpath;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.scrapfii.application.configuration.DefaultWebDriverConfiguration;

public class PageFiisListados extends PageObject{
	
	private static final String ID_SELECT_PAGE = "//*[@id=\"selectPage\"]";
	private static final String MAIN_PAGE_URL = "https://sistemaswebb3-listados.b3.com.br/fundsPage/7";
	private static final String SEARCH_INPUT = "//*[@id=\"palavrachave\"]";
	private static final String SEARCH_BUTTON = "//*[@id=\"divContainerIframeB3\"]/form/div[1]/div/div/div[1]/div/div[2]/button";
	private static final String FIRST_CARD = "//*[@id=\"nav-bloco\"]/div/div[1]/a/div";
	
	private final WebDriver browser;
	
	public PageFiisListados(DefaultWebDriverConfiguration configs) {
		super(configs);
		this.browser = super.getDriver();
	}

	@Override
	public void goToMainPage() {
		this.browser.navigate().to(MAIN_PAGE_URL);
	}

	public PageFundDetail searchFor(String foundCode) {
		this.browser.findElement(xpath(SEARCH_INPUT)).sendKeys(foundCode);
		this.browser.findElement(xpath(SEARCH_BUTTON)).click();
		this.sleep(5);
		this.browser.findElement(xpath(FIRST_CARD)).click();
		return new PageFundDetail(this.getConfigs());
	}

	public WebElement nextPage() {
		WebElement pagination = this.browser.findElement(xpath("//*[@id=\"listing_pagination\"]/pagination-template/ul"));
		return pagination;
	}
	
	public void selectTheLastOption() {
	  List<WebElement>	options = this.browser.findElement(xpath(ID_SELECT_PAGE)).findElements(tagName("option"));
	  if(!options.isEmpty()) {
		  Integer size = options.size()-1;
		  options.get(size).click();		  
	  }
	}

}
