package loja.controller;

import java.util.ArrayList;

import loja.model.Produto;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository {

	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorCodigo(int numero) {
		var produto = buscarNaCollection(numero);
		
		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.println("\nO Codigo " + numero + " não foi encontrado!");
		}

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void adicionarCarrinho(int codigo) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == codigo)
				carrinho.add(produto);
		}
	}

	@Override
	public void removerCarrinho(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if (produto != null) {
			if(listaProdutos.remove(produto) == true) {
				System.out.println("\nO produto foi removido do Carrinho com sucesso!");
			} else {
				System.out.println("\nO produto não foi encontrado!");
			}
		}

	}

	@Override
	public void verCarrinho() {
		for (var produto : carrinho) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == numero) {
				return produto;
			}
		}
		
		return null;
	}

}
