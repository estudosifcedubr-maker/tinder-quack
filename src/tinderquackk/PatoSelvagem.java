package tinderquackk;

import java.util.Scanner;

class PatoSelvagem extends Pato {
	private String regiaoOrigem;
	
	 public void setRegiaoOrigem(String regiaoOrigem) { this.regiaoOrigem = regiaoOrigem; }
	 public String getRegiaoOrigem() { return this.regiaoOrigem; }
	 
	  @Override
	    public void cadastrar() {
	        super.cadastrar();
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Região de Origem: ");
	        this.regiaoOrigem = entrada.nextLine();
	    }

	    public void editarRegiao() {
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Nova Região de Origem: ");
	        this.regiaoOrigem = entrada.nextLine();
	    }

	    public void excluirRegiao() {
	        this.regiaoOrigem = null;
	        System.out.println("Região de origem removida.");
	    }
	}
	 
