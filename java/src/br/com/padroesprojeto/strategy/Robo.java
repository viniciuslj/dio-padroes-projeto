package br.com.padroesprojeto.strategy;

public class Robo {
	
	private ComportamentoStrategy comportamento;

	public void setComportamento(ComportamentoStrategy comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
