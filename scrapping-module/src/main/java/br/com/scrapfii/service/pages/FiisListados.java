package br.com.scrapfii.service.pages;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiisListados extends PageObject{
	private static final String URL = "https://sistemaswebb3-listados.b3.com.br/fundsPage/7";
	private static final String JSON_URL_GET_REQUEST = "https://sistemaswebb3-listados.b3.com.br/fundsProxy/fundsCall/GetListedFundsSIG/eyJ0eXBlRnVuZCI6NywicGFnZU51bWJlciI6MSwicGFnZVNpemUiOjM0NH0=";
	private URL url;	
	
	private WebDriver browser;

	public FiisListados() {
		super();
		this.browser = super.getDriver();
		try {
			this.url = new URL(null);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	public Object getLista() {
		InputStream is = null;
		try {
			URLConnection conn = this.url.openConnection();
			is = conn.getInputStream();
			System.out.println(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	private String getFirstFileName() {
		String txt = this.browser.findElement(By.xpath("//*[@id=\"divContainerIframeB3\"]/form/div[1]/div/p/strong[1]")).getText();
		System.out.println(txt);
		 WebElement sele = this.browser.findElement(By.xpath("//*[@id=\"selectPage\"]/option[3]"));
		return this.browser.findElement(By.id("file-link")).getText();
	}

	public void close() {
		this.browser.close();
	}
}
