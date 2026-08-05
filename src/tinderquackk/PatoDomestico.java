package tinderquackk;

import java.util.Scanner;

class PatoDomestico  extends Pato{
	    private String raca;

	    public void setRaca(String raca) { this.raca = raca; }
	    public String getRaca() { return this.raca; }

	    @Override
	    public void cadastrar() {
	        super.cadastrar();
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Raça: ");
	        this.raca = entrada.nextLine();
	    }

	    public void editarRaca() {
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Nova Raça: ");
	        this.raca = entrada.nextLine();
	    }

	    public void excluirRaca() {
	        this.raca = null;
	        System.out.println("Raça removida.");
	    }
	}
	
