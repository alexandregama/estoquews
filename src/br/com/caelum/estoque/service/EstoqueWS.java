package br.com.caelum.estoque.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {

	@WebMethod
	public List<Item> getItens() {
		ArrayList<Item> lista = new ItemDao().todosItens();
		
		return lista;
	}
	
}
