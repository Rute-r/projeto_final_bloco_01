package loja.model;

public class MarcaPagina extends Produto {

	private String tamanho;
	private String cor;

	public MarcaPagina(int codigo, int quantidade, String tipo, float valor, String tamanho, String cor) {
		super(codigo, quantidade, tipo, valor);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Tamanho do Marca Pagina: " + this.tamanho);
		System.out.println("Cor: " + this.cor);
		super.visualizar();
	}

}
