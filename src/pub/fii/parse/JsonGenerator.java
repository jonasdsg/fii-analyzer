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

import pub.fii.model.Fii;

public class JsonGenerator {
	private final String URL = "https://fiis.com.br/lista-de-fundos-imobiliarios/";
	private final String ELEMENT_CLASS = "item";
	private final String TAG = "span";
	
	private Map<String,String> getList(){
		Map<String,String> codeList = new TreeMap<String, String>();
		try {
			Document listOfFii 	= Jsoup.connect(URL).get();
			Elements elements 	= listOfFii.getElementsByClass(ELEMENT_CLASS);
			for(Element element:elements) {
				Elements e = element.getElementsByTag(TAG);
				codeList.put(e.get(0).text(), e.get(1).text());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return codeList;
	}
	
	@SuppressWarnings("unused")
	private List<Fii> createFiiObject() {
		List<Fii> fiis = new ArrayList<Fii>();
		for(Map.Entry<String, String> generated : getList().entrySet()) {
			fiis.add(new Fii(generated.getKey(),generated.getValue()));
		}
		return fiis;
	}
}
