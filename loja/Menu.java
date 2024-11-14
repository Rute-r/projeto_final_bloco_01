package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.Livro;
import loja.model.MarcaPagina;

import loja.util.Cores;

public class Menu {
	public static void main(String[] args) {
		LojaController produtos = new LojaController();
		Scanner scanner = new Scanner(System.in);
		int opcao, numero;

		Livro l1 = new Livro(11, 7, "Livro", 25.99f, "Orgulho e Preconceito", "Jane Austen");
		produtos.cadastrarProduto(l1);
		Livro l2 = new Livro(12, 6, "Livro", 30.99f, "O Nome do Vento", "Patrick Rotfuss");
		produtos.cadastrarProduto(l2);
		Livro l3 = new Livro(13, 2, "Livro", 20.99f, "O Clube da Luta", "Chuck Palahniuk");
		produtos.cadastrarProduto(l3);
		MarcaPagina m1 = new MarcaPagina(21, 8, "Marca Paginas", 4.99f, "Grande", "Preto com listras brancas");
		produtos.cadastrarProduto(m1);
		MarcaPagina m2 = new MarcaPagina(22, 1, "Marca Paginas", 3.99f, "Medio", "Preto com estrelas azuis");
		produtos.cadastrarProduto(m2);
		MarcaPagina m3 = new MarcaPagina(23, 9, "Marca Paginas", 2.99f, "Pequeno", "Preto com corações rosa");
		produtos.cadastrarProduto(m3);

		while (true) {
			// Menu da Livraria
			System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                LIVRARIA ENTRE LINHAS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar todos os Produtos             ");
			System.out.println("            2 - Buscar por produto por codigo        ");
			System.out.println("            3 - Adicionar ao Carrinho                ");
			System.out.println("            4 - Remover do Carrinho                  ");
			System.out.println("            5 - Ver Carrinho                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

			// Finaliza o Programa
			if (opcao == 6) {
				System.out.println("\nA Livraria Entre Linhas agradece sua visita!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Listar todos os Produtos\n\n");
				produtos.listarTodos();
				keyPress();
				break;
			case 2:
				System.out.println("Buscar Produto por Codigo\n\n");
				System.out.println("Digite o codigo do produto: ");
				numero = scanner.nextInt();

				produtos.procurarPorCodigo(numero);

				keyPress();
				break;
			case 3:
				System.out.println("Adicionar ao Carrinho\n\n");
				System.out.println("Digite o codigo do produto para adiconar ao carrinho: ");
				numero = scanner.nextInt();
				
				produtos.adicionarCarrinho(numero);
				keyPress();
				break;
			case 4:
				System.out.println("Remover do Carrinho\n\n");
				System.out.println("Digite o codigo do produto: ");
				numero = scanner.nextInt();
				
				produtos.removerCarrinho(numero);
				keyPress();
				break;
			case 5:
				System.out.println("Ver produtos no seu Carrinho\n\n");
				produtos.verCarrinho();
				break;
			default:
				System.out.println(Cores.TEXT_RED + "\nOpção invalida!\n");
				keyPress();
				break;
			}
		}

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println(Cores.TEXT_RED + "Você pressionou uma tecla diferente de enter!");
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_YELLOW + "\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Rute S");
		System.out.println("rute.s.r.sousa@gmail.com");
		System.out.println("github.com/Rute-r");
		System.out.println("*********************************************************");

	}
}