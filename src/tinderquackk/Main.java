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
		System.out.println("Qual tipo de Pato? 1 - Doméstico | 2 - Selvagem");
		int tipo = entrada.nextInt();
		entrada.nextLine();
		
		Pato novoPato;
		if(tipo == 1) {
			novoPato = new PatoDomestico();
		}else {
			novoPato = new PatoSelvagem();
		}
		
		novoPato.cadastrar();
		listaPatos.add(novoPato);
		System.out.println("Pato cadastrado com sucesso! ID: " + novoPato.getIdPato());
	}
	
	private static void listarPatos() {
		if (listaPatos.isEmpty()) {
			System.out.println("Nenhum pato cadastrado.");
		}else {
			System.out.println("\n --- Lista de Patos ---");
			for(Pato p : listaPatos) {
				System.out.println("ID: " + p.getIdPato() + " | Nome: " 
			+ p.getNome() + " | Email: " + p.getEmail());
				if(p instanceof PatoDomestico) {
					System.out.println(" (Doméstico -  Raça: " + ((PatoDomestico) p)
							.getRegiaoOrigem() + ")");
				}
			}
		}
	}
	
	private static void buscarPato(Scanner entrada) {
		System.out.println("Digite o ID do Pato: ");
		int id = entrada.nextInt();
		Pato encontrado = null;
		
		for (Pato p: listaPatos) {
			if(p.getIdPato() == id) {
				encontrado = p;
				break;
			}
		}
		
		if (encontrado != null) {
			System.out.println("Pato encontrado: " + encontrado.getNome() + " (" 
		+ encontrado.getEmail() + ")");
		}else {
			System.out.println("Pato não encontrado.");
		}
	}
	private static void atualizarPato(Scanner entrada) {
		System.out.println("Digite o ID do Pato a ser atualizado:");
		int id = entrada.nextInt();
		entrada.nextLine();
		
		Pato encontrado = null;
		for (Pato p: listaPatos) {
			if (p.getIdPato() == id) {
				encontrado = p;
				break;
			}
		}
		if (encontrado != null) {
			encontrado.editarDados();
			System.out.println("Dados atualizados com sucesso!");
		}else {
			System.out.println("Pato não encontrado.");
		}
	}
	private static void deletarPato(Scanner entrada) {
		System.out.println("Digite o ID do pato a ser deletado: ");
		int id = entrada.nextInt();
		
		Pato encontrado = null;
		for (Pato p: listaPatos) {
			if(p. getIdPato() == id) {
				encontrado = p;
				break;
			}
		}
		if (encontrado != null) {
		listaPatos.remove(encontrado);
		System.out.println("Pato removido com sucesso!");
		}else {
			System.out.println("pato não encontrado.");
			}
		}
	private static void criarPerfil(Scanner entrada) {
		Perfil perfil = new Perfil();
		perfil.cadastrar();
		listaPerfis.add(perfil);
		System.out.println("Perfil craido e vinculado ao sistema!");
	  }	
	}