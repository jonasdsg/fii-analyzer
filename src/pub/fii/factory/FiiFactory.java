package pub.fii.factory;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pub.fii.model.Fii;
import pub.fii.model.Proventos;

public class FiiFactory {
	
	private static final int MINIMUMCODESIZE = 4;
	private static final String TABLE_ID = "id_stocks_dividends";
	private static final String DATE_CLASS = "col-pmt-date";
	private static final String AMOUNT_VALUE_CLASS = "col-amount-paid";
	private static final String DY_CLASS = "col-dividend-yield";
	private static final String GET_FII_LIST_URL = "https://fiis.com.br/lista-de-fundos-imobiliarios/";
	private static final String GET_FII_LIST_ID = "items-wrapper";
	
	private static Document getDocument(String url) {
		try
		{
			return Jsoup.connect(url).get(); 
		}
		catch(IOException e) 
		{
			System.out.println("Falha ao obter: "+url);
		}
		
		return null;
	}
	
	private static String urlGenerator(String fiiCode) {
		
		String fiiCodeLowerCase = fiiCode.toLowerCase().substring(0, fiiCode.length()-2);
		
		if(MINIMUMCODESIZE>fiiCode.length()) 
		{
			return null;		
		}
			
		return "https://br.advfn.com/bolsa-de-valores/bovespa/fii-"+fiiCodeLowerCase+"-propci-"+fiiCode+"/dividendos/historico-de-proventos";
	}
	
	private static List<Proventos> proventosGenerator(String fiiCode) throws IllegalArgumentException {
		
		String validUrl = urlGenerator(fiiCode);
		if(isNull(validUrl)) 
		{
			throw new IllegalArgumentException("O código de FII para gerar o histórico não pode ser nulo ou vazio");			
		}
		
		
		Element  table 			= getDocument(validUrl).getElementById(TABLE_ID);
		Elements paymentDate 	= table.getElementsByClass(DATE_CLASS);
		Elements dividendYield 	= table.getElementsByClass(DY_CLASS);
		Elements amountMonth 	= table.getElementsByClass(AMOUNT_VALUE_CLASS);
			
		List<Proventos> listaProventos = new ArrayList<Proventos>();
		
		for(int i = 1; i<paymentDate.size(); i++) 
		{
			Proventos temporary = new Proventos();
			temporary.setDiaPagamento(parseToLocalDate(paymentDate.get(i).text()));
			temporary.setValor(Double.parseDouble(amountMonth.get(i).text().replace(',','.')));;
			String dy = dividendYield.get(i).text().replace('-','0');
			dy = dy.replace(',','.');
			dy = dy.replace('%', ' ');
			temporary.setDy(Double.parseDouble(dy));	
			listaProventos.add(temporary);
		}
		
		return listaProventos;
	}

	public static List<Fii> getFiiList() {
		List<Fii> list = new ArrayList<>();
		
		try 
		{
			Element fiiList = getDocument(GET_FII_LIST_URL).getElementById(GET_FII_LIST_ID);
			Elements fiiNames = fiiList.getElementsByClass("name");
			Elements fiiCodes = fiiList.getElementsByClass("ticker");
			
			for(int i = 0; i<fiiCodes.size(); i++) 
			{
				if(getDocument(urlGenerator(fiiCodes.get(i).text()))!=null)
				{	
					Fii fii = new Fii();
					fii.setFiiCode(fiiCodes.get(i).text());
					fii.setFiiNome(fiiNames.get(i).text());
					fii.setProventos(proventosGenerator(fiiCodes.get(i).text()));
					list.add(fii);
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Falha ao gerar Fii, message: "+e.getCause());
			list = null;
		}
		
		return list;
	}
	
	private static LocalDate parseToLocalDate(String date) {
		return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	private static boolean isNull(String value) {
		if(value.isEmpty()||value==null)
			return true;
		return false;
	}
}
