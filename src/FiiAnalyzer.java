import java.util.List;


import pub.fii.factory.FiiFactory;
import pub.fii.model.Fii;
import pub.fii.model.Proventos;

public class FiiAnalyzer {

	public static void main(String[] args) {
	
		List<Fii> list = FiiFactory.getFiiList();
		
		for(Fii fii: list) {
			System.out.println("Código: "+fii.getFiiCode()+", Nome: "+fii.getFiiNome());
			for(Proventos proventos: fii.getProventos()) {
				System.out.println("Pagamento"+proventos.getDiaPagamento()+", Valor:"+proventos.getValor());
			}
		}
		
	}

}
