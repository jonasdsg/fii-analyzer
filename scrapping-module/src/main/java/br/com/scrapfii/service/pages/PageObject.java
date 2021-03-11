package br.com.scrapfii.service.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {
	private WebDriver driver;
	
	public PageObject() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
		this.driver = new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	protected void sleep(Integer seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
