package br.com.scrapfii.shared.pageObjects;

import org.openqa.selenium.WebDriver;

import br.com.scrapfii.application.configuration.DefaultWebDriverConfiguration;

public abstract class PageObject {
	private DefaultWebDriverConfiguration configs;
	
	public PageObject(DefaultWebDriverConfiguration configs) {
		this.configs = configs;
	}
	
	protected WebDriver getDriver() {
		return this.configs.getDriver();
	}
	
	public abstract void goToMainPage();
	
	protected DefaultWebDriverConfiguration getConfigs() {
		return this.configs;
	}
	
	public void close() {
		this.configs.getDriver().close();
	}
	
	protected void sleep(Integer seconds) {
		try { Thread.sleep(seconds*1000); }
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
