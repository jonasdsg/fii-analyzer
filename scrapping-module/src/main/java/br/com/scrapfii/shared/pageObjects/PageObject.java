package br.com.scrapfii.shared.pageObjects;

import org.openqa.selenium.WebDriver;

import br.com.scrapfii.application.configuration.DefaultConfigurationDriver;

public abstract class PageObject {
	private DefaultConfigurationDriver configs;
	
	public PageObject(DefaultConfigurationDriver configs) {
		this.configs = configs;
	}
	
	protected WebDriver getDriver() {
		return this.configs.getDriver();
	}
	
	public abstract void goToMainPage();
	
	protected DefaultConfigurationDriver getConfigs() {
		return this.configs;
	}
	
	public void close() {
		this.configs.getDriver().close();
	}
	

}
