package br.com.padroesprojeto.strategy;

public class AgressivoStrategy implements ComportamentoStrategy {
	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}
}
