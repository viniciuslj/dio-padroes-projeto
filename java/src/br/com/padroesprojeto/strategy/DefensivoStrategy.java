package br.com.padroesprojeto.strategy;

public class DefensivoStrategy implements ComportamentoStrategy {
	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}
}
