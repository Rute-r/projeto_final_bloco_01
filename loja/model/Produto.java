package loja.model;

public abstract class Produto {
	// Atributos do produto
	private int codigo;
	private int quantidade;
	private String tipo;
	private float valor;

	public Produto(int codigo, int quantidade, String tipo, float valor) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	// Metodos do produto
	public void adicionar() {
		if (this.getQuantidade() >= 0) {
			this.setQuantidade(quantidade + 1);
			System.out.println("Adicionado ao carrinho");
		}
	}

	public void remover() {
		if (this.getQuantidade() <= 0) {
			System.out.println("Este produto não está no carrinho!");
		} else {
			this.setQuantidade(quantidade - 1);
			System.out.println("Removido do carrinho");
		}

	}

	public void visualizar() {
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Codigo do produto: " + this.codigo);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Valor (R$): " + this.valor);
		System.out.println("***********************************************************");
	}

}
