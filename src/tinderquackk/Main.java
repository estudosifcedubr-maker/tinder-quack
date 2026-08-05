package tinderquackk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Pato> listaPatos = new ArrayList<>();
	static ArrayList<Perfil> listaPerfis = new ArrayList<>();
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n=== SISTEMA PATOS ===");
			System.out.println("1 - Cadastrar Pato (Doméstico ou Selvagem)");
			System.out.println("2 - Listar Patos");
			System.out.println("3 - Buscar Pato por ID");
			System.out.println("4 - Atualizar Dados de um Pato");
			System.out.println("5 - Deletar Pato");
			System.out.println("6 - Criar Perfil para um Pato");
			System.out.println("7 - Sair");
			System.out.println("Escolha: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
				case 1:
					cadastrarPato(entrada);
					break;
				case 2:
					listarPatos();
					break;
				case 3:
					buscarPato(entrada);
					break;
				case 4:
					atualizarPato(entrada);
					break;
				case 5:
					deletarPato(entrada);
					break;
				case 6:
					criarPerfil(entrada);
					break;
				case 7:
					System.out.println("Saindo do sistema...");
					break;
				default:
					System.out.println("Opcão inválida.");
			}
		}while (opcao !=7);
	}

	private static void cadastrarPato(Scanner entrada) {
	
	}
		
	private static void listarPatos() {
	}
	private static void buscarPato(Scanner entrada) {
	}
	private static void atualizarPato(Scanner entrada) {
	}
	private static void deletarPato(Scanner entrada) {
	}
	private static void criarPerfil(Scanner entrada) {
	}
	
		
		
		
		
		
	}

}







