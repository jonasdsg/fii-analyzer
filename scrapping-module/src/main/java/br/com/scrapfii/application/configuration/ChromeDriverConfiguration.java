package br.com.scrapfii.application.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverConfiguration implements DefaultConfigurationDriver {
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
