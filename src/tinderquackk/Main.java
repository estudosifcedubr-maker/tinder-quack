package tinderquackk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static PatoService service = new PatoService();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n=== SISTEMA PATOS (VERSÃO FINAL) ===");
            System.out.println("1 - Cadastrar Pato");
            System.out.println("2 - Listar Patos");
            System.out.println("3 - Buscar Pato por ID");
            System.out.println("4 - Atualizar Pato");
            System.out.println("5 - Deletar Pato");
            System.out.println("6 - Sair");
            System.out.println("7 - Curtir outro Pato");
            System.out.println("8 - Enviar Mensagem");
            System.out.print("Escolha: ");
            
            try {
                opcao = entrada.nextInt();
                entrada.nextLine(); 

                switch (opcao) {
                    case 1:
                        cadastrarPato(entrada);
                        break;
                    case 2:
                        service.listarPatos();
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
                        System.out.println("Encerrando sistema...");
                        break;
                    case 7:
                        curtirPato(entrada); 
                        break;
                    case 8:
                        enviarMensagem(entrada); 
                        break;
                    default:
                        System.out.println("Opção inválida. Digite um número de 1 a 8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Você digitou uma letra ou caractere inválido. Digite apenas números.");
                entrada.nextLine(); 
                opcao = 0; 
            }

        } while (opcao != 6);
        
        entrada.close();
    }

    private static void cadastrarPato(Scanner entrada) {
        int tipo = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Qual tipo de Pato? 1 - Doméstico | 2 - Selvagem");
            try {
                tipo = entrada.nextInt();
                entrada.nextLine(); 
                if (tipo == 1 || tipo == 2) {
                    entradaValida = true;
                } else {
                    System.out.println("Erro: Digite apenas 1 ou 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Você digitou uma letra. Digite apenas números (1 ou 2).");
                entrada.nextLine(); 
            }
        }

        Pato novoPato;
        if (tipo == 1) {
            novoPato = new PatoDomestico();
        } else {
            novoPato = new PatoSelvagem();
        }

        novoPato.cadastrar();
        service.adicionarPato(novoPato);
    }

    private static void buscarPato(Scanner entrada) {
        try {
            System.out.print("Digite o ID do Pato: ");
            int id = entrada.nextInt();
            Pato p = service.buscarPatoPorId(id);
            
            if (p != null) {
                System.out.println("Pato encontrado:");
                System.out.println("ID: " + p.getIdPato() + " - Nome: " + p.getNome() + " - Email: " + p.getEmail());
            } else {
                System.out.println("Nenhum pato encontrado com este ID.");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERRO: ID deve ser um número inteiro.");
            entrada.nextLine(); 
        }
    }

    private static void atualizarPato(Scanner entrada) {
        try {
            System.out.print("Digite o ID do Pato para atualizar: ");
            int id = entrada.nextInt();
            entrada.nextLine(); 
            
            System.out.print("Digite o NOVO nome: ");
            String nome = entrada.nextLine();
            System.out.print("Digite a NOVA idade: ");
            int idade = entrada.nextInt();
            
            service.atualizarPato(id, nome, idade);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: ID e Idade devem ser números inteiros.");
            entrada.nextLine(); 
        }
    }

    private static void deletarPato(Scanner entrada) {
        try {
            System.out.print("Digite o ID do Pato para deletar: ");
            int id = entrada.nextInt();
            service.deletarPato(id);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: ID deve ser um número inteiro.");
            entrada.nextLine(); 
        }
    }

    private static void curtirPato(Scanner entrada) {
        try {
            System.out.print("Digite o ID do pato que está CURTINDO: ");
            int idCurtidor = entrada.nextInt();
            System.out.print("Digite o ID do pato que será CURTIDO: ");
            int idCurtido = entrada.nextInt();
            
            service.curtirPato(idCurtidor, idCurtido);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite apenas números para os IDs.");
            entrada.nextLine();
        }
    }

    private static void enviarMensagem(Scanner entrada) {
        try {
            System.out.print("Digite o ID do REMETENTE: ");
            int idRemetente = entrada.nextInt();
            entrada.nextLine(); 
            
            System.out.print("Digite o ID do DESTINATÁRIO: ");
            int idDestinatario = entrada.nextInt();
            entrada.nextLine(); 

            System.out.print("Digite a mensagem: ");
            String texto = entrada.nextLine();

            service.enviarMensagem(idRemetente, idDestinatario, texto);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Digite apenas números para os IDs.");
            entrada.nextLine();
        }
    }
}