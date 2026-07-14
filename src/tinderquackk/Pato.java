package tinderquackk;

public class Pato {
	String email;
	String nome;
	String senha;
	String sexo;
	int idade;
	int telefone;
	int idPato;
	
	boolean logado = false;
	
	void login(String emailnovo, String nomenovo, String senhaNova, String sexonovo, int idadenovo, int telefonenovo, int idPatonovo ) {
		this.email = emailnovo;
		this.nome = nomenovo;
		this.senha = senhaNova;
		this.sexo = sexonovo;
		this.idade = idadenovo;
		this.telefone = telefonenovo;
		this.idPato = idPatonovo;
		this.logado = true;
		System.out.println("Login realizado com sucesso para o pato: " + this.nome);
	}
	void sairDaConta() {
		
	}
	void editarDados() {
		
	}
	void excluirConta() {
		
	}

}
