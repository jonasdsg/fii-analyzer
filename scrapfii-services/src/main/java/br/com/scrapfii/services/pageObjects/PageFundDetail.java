package br.com.scrapfii.services.pageObjects;

import static java.util.Objects.nonNull;
import static org.openqa.selenium.By.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.scrapfii.services.configurations.DefaultWebDriverConfiguration;

public class PageFundDetail extends PageObject {
	private static final String HISTORY_LINK_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[3]/div/div/div/p/a";
	private static final String BOOK_KEEPER_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[2]/div/div/div/p[2]";
	private static final String DIRECTOR_CONTACT = "/html/body/app-root/app-funds-main/div/app-funds-about/div/div[1]/div[2]/div/div/p[6]";
	private static final String ADDRESS_AND_PHONE_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[2]/div/div/p[4]";
	private static final String DEPARTMENT_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[1]/div/div/p[10]";
	private static final String SITE_PATH = "/html/body/app-root/app-funds-main/div/app-funds-about/div/div[1]/div[1]/div/div/p[8]/a";
	private static final String CNPJ_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[1]/div/div/p[6]";
	private static final String NAME_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[1]/div/div/p[2]";
	private static final String MAIN_PAGE_URL = "";
	private static final String DIV_CARDS_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div[1]/div[1]";
	private static final String CARDS_PATH = "//*[@id=\"divContainerIframeB3\"]/app-funds-about/div/div/div/div/div";
	
	
	private WebDriver browser;
	
	public PageFundDetail(DefaultWebDriverConfiguration configs) {
		super(configs);
		this.browser = configs.getDriver(); 
	}



	public PageFundDetail(WebDriver driver) {
		super(driver);
		this.browser = super.getDriver();
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

	public String getName() {
		String name = this.get(NAME_PATH);
		return name;
	}
	
	public String getCnpj() {
		String cnpj = this.get(CNPJ_PATH);
		return cnpj;
	}

	public String getSite() {
		String site = this.get(SITE_PATH);
		return site;
	}
	
	public String getDepartment() {
		String department = this.get(DEPARTMENT_PATH);
		return department;
	}
	
	public String getAdress() {
		String address = this.splitContact()[0];
		return address;
	}
	public String getPhone() {
		return this.splitContact()[1];
	}
	
	public String getDirectorData() {
		String director = this.get(DIRECTOR_CONTACT);
		return director;
	}
	public String getBookKeeperData() {
		String bookKeeper = this.get(BOOK_KEEPER_PATH);
		return bookKeeper;
	}
	
	public WebDriver getHistoryPage() {
		this.browser.findElement(xpath(HISTORY_LINK_PATH)).click();
		return this.browser;
	}
	
	private String[] splitContact() {
		String data = this.get(ADDRESS_AND_PHONE_PATH);
		
		if(nonNull(data)) {
			return data.split("\\n");
		}
		return new String[] { null , null};
	}

	private String get(String path) {
		try
		{ 
			WebElement data = this.browser.findElement(xpath(path));
			return data.getText();
		}
		catch(NoSuchElementException error) 
		{	
			return null;	
		}
	}
}
