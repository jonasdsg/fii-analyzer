package br.com.scrapfii.application.shared.pageObjects;

import static java.util.Objects.isNull;

import br.com.scrapfii.application.configuration.ChromeDriverConfiguration;
import br.com.scrapfii.application.configuration.DefaultWebDriverConfiguration;

public abstract class PageObjectTest {
	
	private static DefaultWebDriverConfiguration config;
	
	public static DefaultWebDriverConfiguration getWebDriverConfig() {
		
		if(isNull(config)) {
			config = new ChromeDriverConfiguration();
		}
		
		return config;
	}
	
	
	protected void sleep(Integer seconds){
		
		try { Thread.sleep(seconds*1000); } 
		catch (InterruptedException exception) {
			throw new RuntimeException(exception);
		}
	}
}
