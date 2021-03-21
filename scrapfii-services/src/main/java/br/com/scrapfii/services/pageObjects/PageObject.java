package br.com.scrapfii.services.pageObjects;

import org.openqa.selenium.WebDriver;

import br.com.scrapfii.services.configurations.DefaultWebDriverConfiguration;

public abstract class PageObject {
	private WebDriver driver;
	
	public PageObject(DefaultWebDriverConfiguration configs) {
		this.driver = configs.getDriver();
	}
	public PageObject(WebDriver driver) {
		this.driver = driver;
	}
	protected WebDriver getDriver() {
		return this.driver;
	}
	
	public abstract void goToMainPage();
	
	public void close() {
		this.driver.close();
	}
	
	protected void sleep(Integer seconds) {
		try { Thread.sleep(seconds*1000); }
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
