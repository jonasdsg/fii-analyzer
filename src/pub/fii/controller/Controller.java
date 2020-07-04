package pub.fii.controller;

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

public class Controller {
	private static final int MINIMUMCODESIZE = 4;
	private static final String TABLE_ID = "id_stocks_dividends";
	private static final String DATE_CLASS = "col-pmt-date";
	private static final String AMOUNT_VALUE_CLASS = "col-amount-paid";
	private static final String DY_CLASS = "col-dividend-yield";
	
	private static Document getDocument(String url) {
		try{
			return Jsoup.connect(url).get(); 
		}catch(IOException e) {
			System.out.println("Falha ao obter documento");
		}
		return null;
	}
	
	private static String urlGenerator(String fiiCode) {
		String fiiCodeLowerCase = fiiCode.toLowerCase().substring(0, fiiCode.length()-2);
		if(MINIMUMCODESIZE>fiiCode.length())
			return null;
		
		return "https://br.advfn.com/bolsa-de-valores/bovespa/fii-"+fiiCodeLowerCase+"-propci-"+fiiCode+"/dividendos/historico-de-proventos";
	}
	
	private static List<Proventos> proventosGenerator(String fiiCode) throws IllegalArgumentException {
		String validUrl = urlGenerator(fiiCode);
		if(isNull(validUrl))
			throw new IllegalArgumentException("O código de FII para gerar o histórico não pode ser nulo ou vazio");
		
		Element  table 			= getDocument(validUrl).getElementById(TABLE_ID);
		Elements paymentDate 	= table.getElementsByClass(DATE_CLASS);
		Elements dividendYield 	= table.getElementsByClass(DY_CLASS);
		Elements amountMonth 	= table.getElementsByClass(AMOUNT_VALUE_CLASS);
			
		List<Proventos> listaProventos = new ArrayList<Proventos>();
	
		for(int i = 0; i<paymentDate.size(); i++) {
			Proventos temporary = new Proventos();
			temporary.setDiaPagamento(parseToLocalDate(paymentDate.get(i).text()));
			temporary.setValor(Double.parseDouble(amountMonth.get(i).text().replace(',','.')));;
			temporary.setDy(Double.parseDouble(dividendYield.get(i).text().replace('-',' ')));
			listaProventos.add(temporary);
		}

		return listaProventos;
	}
	
	@SuppressWarnings("finally")
	public static Fii fiiGenerator(String fiiCode) {
		Fii fii = null;
		try {			
			fii = new Fii();
			fii.setFiiCode(fiiCode);
			fii.setProventos(proventosGenerator(fiiCode));
		}catch(Exception e) {
			System.out.println("Falha ao gerar Fii.");
			fii = null;
		}finally {
			return fii;
		}
	}
	
	
	
	private static LocalDate parseToLocalDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(date, formatter);
	}
	
	private static boolean isNull(String value) {
		if(value.isEmpty()||value==null)
			return true;
		return false;
	}
}
