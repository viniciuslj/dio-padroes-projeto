package br.com.padroesprojeto.subsistemas.cep;

public class CepApi {

	private static CepApi instance = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstance() {
		return instance;
	}
	
	public String recuperarCidade(String cep) {
		return "Vitoria";
	}
	
	public String recuperarEstado(String cep) {
		return "ES";
	}
}
