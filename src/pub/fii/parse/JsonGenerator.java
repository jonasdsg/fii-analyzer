package pub.fii.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pub.fii.factory.FiiFactory;
import pub.fii.model.Fii;

public class JsonGenerator {
	private List<Fii> fiiList = FiiFactory.getFiiList();
	
	public List<String> jsonBuilder() {
		List<String> jsons = new ArrayList();
		for(Fii fii: fiiList) {
			String aux = "FiiName:"+fii.getFiiNome()+"FiiCode:"+fii.getFiiCode();
		}
		
		return null;
	}
}
