package br.com.scrapfii.services.pageObjects;

import static java.util.Objects.isNull;

import br.com.scrapfii.services.configurations.ChromeDriverConfiguration;
import br.com.scrapfii.services.configurations.DefaultWebDriverConfiguration;

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
