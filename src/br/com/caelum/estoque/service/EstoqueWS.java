package br.com.caelum.estoque.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {

	@WebMethod
	public List<Item> getItens() {
		List<Item> lista = new ItemDao().todosItens();
		
		return lista;
	}
	
	@WebMethod(operationName = "itens")
	@WebResult(name = "itensEncontrados")
	public List<Item> getTodosOsItens() {
		List<Item> lista = new ItemDao().todosItens();
		
		return lista;
	}

	@WebMethod(operationName = "itemPorCodigo")
	@WebResult(name = "itemEncontrado")
	public Item quantidadePorCodigo(@WebParam(name = "codigo") String codigo) {
		Item item = new ItemDao().quantidadeDo(codigo);
		
		return item;
	}
	
	@WebMethod(operationName = "itensPeloCodigo")
	public List<Item> quantidadePorCodigos(List<Filtro> filtros) {
		List<Item> itens = new ItemDao().todosItens(filtros);
		
		return itens;
	}
}
