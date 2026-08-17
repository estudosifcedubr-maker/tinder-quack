package tinderquackk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pato {
    protected String email;
    protected String nome;
    protected int telefone;
    protected String sexo;
    protected int idade;
    protected String senha;
    protected int idPato;
    
    private static int contadorId = 1;

    public Pato() {
        this.idPato = contadorId++;
    }

    // Getters e Setters
    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setTelefone(int telefone) { this.telefone = telefone; }
    public int getTelefone() { return this.telefone; }

    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getSexo() { return this.sexo; }

    public void setIdade(int idade) { 
        if(idade >= 0) {
            this.idade = idade; 
        } else {
            System.out.println("Erro: Idade não pode ser negativa. Definindo como 0.");
            this.idade = 0;
        }
    }
    public int getIdade() { return this.idade; }

    public void setSenha(String senha) { this.senha = senha; }
    public int getIdPato() { return this.idPato; }

    public void cadastrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- Cadastro de Pato ---");
        System.out.print("Email: ");
        this.email = entrada.nextLine();
        System.out.print("Nome: ");
        this.nome = entrada.nextLine();
        
        boolean valido = false;
        while(!valido) {
            try {
                System.out.print("Telefone: ");
                this.telefone = entrada.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Digite apenas números no telefone.");
                entrada.nextLine();
            }
        }
        entrada.nextLine(); 

        System.out.print("Sexo: ");
        this.sexo = entrada.nextLine();
        
        valido = false;
        while(!valido) {
            try {
                System.out.print("Idade: ");
                this.idade = entrada.nextInt();
                if(this.idade >= 0) {
                    valido = true;
                } else {
                    System.out.println("ERRO: A idade não pode ser negativa.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Digite apenas números na idade.");
                entrada.nextLine();
            }
        }
        entrada.nextLine(); 
        
        System.out.print("Senha: ");
        this.senha = entrada.nextLine();
    }


    public void mostrarDetalhes() {
        System.out.println("ID: " + idPato + " - " + nome);
    }
}