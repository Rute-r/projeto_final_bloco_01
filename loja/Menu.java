package loja;

import java.util.Scanner;

import loja.util.Cores;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		// Menu da Livraria
		System.out.println(Cores.TEXT_YELLOW
				+ "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                LIVRARIA ENTRE LINHAS                ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Listar todos os Livros               ");
		System.out.println("            2 - Buscar por Nome                      ");
		System.out.println("            3 - Adicionar ao Carrinho                ");
		System.out.println("            4 - Remover do Carrinho                  ");
		System.out.println("            5 - Ver Carrinho                         ");
		System.out.println("            6 - Editar Carrinho                      ");
		System.out.println("            7 - Finalizar Compra                     ");
		System.out.println("            8 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);
		opcao = scanner.nextInt();

		// Finaliza o Programa
		if (opcao == 8) {
			System.out.println("\nA Livraria Entre Linhas agradece sua visita!");
			sobre();
			scanner.close();
			System.exit(0);
		}

		switch (opcao) {
		case 1:
			System.out.println("Listar todos os Livros\n\n");
			break;
		case 2:
			System.out.println("Buscar Livros por Nome\n\n");
			break;
		case 3:
			System.out.println("Adicionar ao Carrinho\n\n");
			break;
		case 4:
			System.out.println("Remover do Carrinho\n\n");
			break;
		case 5:
			System.out.println("Ver livros no seu Carrinho\n\n");
			break;
		case 6:
			System.out.println("Editar Quantidade de Livros no Carrinho\n\n");
			break;
		case 7:
			System.out.println("Finalizar Compra\n\n");
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção invalida!\n");
			break;
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