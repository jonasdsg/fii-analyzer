package br.com.scrapfii.service.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FiisListados extends PageObject{
	private static final String URL = "https://sistemaswebb3-listados.b3.com.br/fundsPage/7";
	private WebDriver browser;

	public FiisListados() {
		super();
		this.browser = super.getDriver();
		this.browser.navigate().to(URL);
	}

	public Object getLista() {
		this.sleep(5);
		this.browser.findElement(By.xpath("//*[@id=\"divContainerIframeB3\"]/div/div/div/div[1]/div[2]/p/a")).click();
		this.sleep(5);
		return null;
	}
	

	public void close() {
		this.browser.close();
	}
}
