package br.com.caelum.estoque.endpoint;

import javax.xml.ws.Endpoint;

import br.com.caelum.estoque.service.EstoqueWS;

public class PublicadorWebService {

	public static void main(String[] args) {
		EstoqueWS servico = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		
		Endpoint.publish(url, servico);
		System.out.println("WebService pronto para uso!");
	}
	
}
