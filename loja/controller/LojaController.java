package loja.controller;

import java.util.ArrayList;

import loja.model.Produto;
import loja.repository.LojaRepository;
import loja.util.Cores;

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
			System.out.println(Cores.TEXT_GREEN + "O produto foi adicionado ao Carrinho!");
		}
	}

	@Override
	public void removerCarrinho(int codigo) {
		if (!carrinho.isEmpty()) {
			for (var produto : listaProdutos) {

				if (produto.getCodigo() == codigo) {
					carrinho.remove(produto);
					System.out.println(Cores.TEXT_GREEN + "\nO produto foi removido!");
				}
			}
		} else {
			System.out.println(Cores.TEXT_RED + "\nO carrinho está vazio!");
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
