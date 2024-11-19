package sistemaEcommerce;

import java.util.Scanner;

public class Ecommerce {
	public static void main(String[] args) {
	
		        try {
		            // Código principal
		            // Simulação de erro para ilustrar o uso de exceção
		            throw new Exception("Erro de sistema! Algo deu errado.");
		        } catch (Exception e) {
		            System.out.println("Exceção capturada: " + e.getMessage());
		        }

		
		
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n---- MENU PRINCIPAL ----");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Exibir Produtos");
			System.out.println("3. Comprar Produto");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				cadastrarProduto(scanner);
				break;
			case 2:
				exibirProdutos();
				break;
			case 3:
				comprarProduto(scanner);
				break;
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

		scanner.close();
	}

	public static void cadastrarProduto(Scanner scanner) {
		System.out.print("Digite o nome do produto: ");
		scanner.nextLine(); // limpar o buffer
		String nomeProduto = scanner.nextLine();
		System.out.print("Digite o preço do produto: ");
		double preco = scanner.nextDouble();
		System.out.println("Produto cadastrado: " + nomeProduto + " - R$ " + preco);
	}

	public static void exibirProdutos() {
		System.out.println("Exibindo produtos...");
		// Aqui você deve implementar a lógica de exibição dos produtos cadastrados
	}

	public static void comprarProduto(Scanner scanner) {
		System.out.print("Digite o nome do produto para compra: ");
		scanner.nextLine(); // limpar o buffer
		String nomeProduto = scanner.nextLine();
		System.out.println("Produto " + nomeProduto + " comprado com sucesso!");
	}
}
