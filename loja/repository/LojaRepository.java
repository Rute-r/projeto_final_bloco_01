package loja.repository;

import loja.model.Produto;

public interface LojaRepository {
	public void procurarPorTitulo(String titulo);
	public void listarTodos();
	public void editarCarrinho(Produto produto);
	public void adicionarCarrinho(Produto produto);
	public void removerCarrinho(int codigo);
	

}
