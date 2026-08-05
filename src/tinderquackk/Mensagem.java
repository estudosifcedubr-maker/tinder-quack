package tinderquackk;

class Mensagem {
	private int idMensagem;
	private String conteudo;
	private Perfil enviadoPor;
	private static int contadorMsg = 1;
	
	public Mensagem() {
		this.idMensagem = contadorMsg++;
	}
	public void enviarMensagem(Perfil remetente, String texto) {
		this.enviadoPor = remetente;
		this.conteudo = texto;
		System.out.println("Mensagem enviada por " + 
	remetente.getNomeDoUsuario() + ":" + texto);
	}
	public void apagarMensagem() {
		this.conteudo = null;
		System.out.println("Mensagem apagada.");
	}
}
