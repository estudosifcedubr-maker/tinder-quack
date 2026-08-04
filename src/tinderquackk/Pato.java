package tinderquackk;

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
	 
	 public void setEmail (String email) { this.email = email;}
	 public String getEmail() {return this.email;}
	 
	 public void setNome (String nome) { this.nome = nome;}
	 public String getNome() {return this.nome;}
	 
	 public void setTelefone (int telefone) { this.telefone = telefone;}
	 public int getTelefone() {return this.telefone;}
	 
	 public void setSexo (String sexo) { this.sexo = sexo;}
	 public String getSexo() {return this.sexo;}
	 
	 public void setIdade (int idade) { this.idade = idade;}
	 public int getIdade() {return this.idade;}
	 
	 public void setSenha (String senha) { this.senha = senha;}
	 public int getIdPato() {return this.idPato;}

	 public void login (String emailInput, String senhaInput) {
		 if(this.email.equals(emailInput) && this.senha.equals(senhaInput)) { 
			 System.out.println("Login realizado sucesso! ");
		 } else {
			 System.out.println("Email ou senha incorretos.");
		 }
	 }
	 
	 public void sairDaConta (){
		 System.out.println("Saindo da conta...");
	 }
	 
	 public void cadastrar() {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("---Cadastro de Pato ---");
		 System.out.println("Email: ");
		 this.email = entrada.nextLine();
		 System.out.println("Nome: ");
	     this.nome = entrada.nextLine();
	        System.out.print("Telefone: ");
	        this.telefone = entrada.nextInt();
	        entrada.nextLine();
	        System.out.print("Sexo: ");
	        this.sexo = entrada.nextLine();
	        System.out.print("Idade: ");
	        this.idade = entrada.nextInt();
	        entrada.nextLine();
	        System.out.print("Senha: ");
	        this.senha = entrada.nextLine();
	    }

	    public void editarDados() {
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("--- Editando Pato ID " + this.idPato + " ---");
	        System.out.print("Novo Nome: ");
	        this.nome = entrada.nextLine();
	        System.out.print("Nova Idade: ");
	        this.idade = entrada.nextInt();
	    }

	 }
	 
	 
	 
	 
	 
