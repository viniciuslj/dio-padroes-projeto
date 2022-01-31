package br.com.padroesprojeto.strategy;

public class NormalStrategy implements ComportamentoStrategy {
	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}
}
