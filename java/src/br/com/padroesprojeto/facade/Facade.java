package br.com.padroesprojeto.facade;

import br.com.padroesprojeto.subsistemas.crm.CrmService;
import br.com.padroesprojeto.subsistemas.cep.CepApi;

public class Facade {
	public void salvaCliente(String nome, String cep) {
		String cidade = CepApi.getInstance().recuperarCidade(cep);
		String estado = CepApi.getInstance().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
