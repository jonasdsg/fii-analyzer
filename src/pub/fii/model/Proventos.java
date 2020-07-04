package pub.fii.model;

import java.time.LocalDate;

public class Proventos {
	
	private LocalDate diaPagamento;
	private double dividend_yield;
	private double valor;
	
	public LocalDate getDiaPagamento() {
		return diaPagamento;
	}
	public void setDiaPagamento(LocalDate diaPagamento) {
		this.diaPagamento = diaPagamento;
	}
	public double getDy() {
		return dividend_yield;
	}
	public void setDy(double dividend_yield) {
		this.dividend_yield = dividend_yield;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
