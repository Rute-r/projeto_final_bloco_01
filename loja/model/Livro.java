package loja.model;

public class Livro extends Produto {

	private String titulo;
	private String autor;

	public Livro(int codigo, int quantidade, String tipo, float valor, String titulo, String autor) {
		super(codigo, quantidade, tipo, valor);
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		super.visualizar();

	}

}
