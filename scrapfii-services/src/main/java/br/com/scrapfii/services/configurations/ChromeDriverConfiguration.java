package br.com.scrapfii.services.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverConfiguration implements DefaultWebDriverConfiguration {
	private WebDriver driver;
	
	public ChromeDriverConfiguration() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
		this.driver = new ChromeDriver();
	}
	
	@Override
	public WebDriver getDriver() {
		return this.driver;
	}



}
