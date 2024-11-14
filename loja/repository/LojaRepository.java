package loja.repository;

import loja.model.Produto;

public interface LojaRepository {
	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void verCarrinho();
	public void cadastrarProduto(Produto produto);
	public void adicionarCarrinho(int codigo);
	public void removerCarrinho(int codigo);
	

}
