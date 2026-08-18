package tinderquackk;

public class Curtida {
    private int idCurtida;
    private Perfil perfilOrigem;
    private Perfil perfilDestino;
    private static int contadorCurtida = 1;

    public Curtida() {
        this.idCurtida = contadorCurtida++;
    }

    public void registrarCurtida(Perfil origem, Perfil destino) {
        this.perfilOrigem = origem;
        this.perfilDestino = destino;
        System.out.println("Curtida registrada de " + origem.getNomeDoUsuario() + " para " + destino.getNomeDoUsuario());
    }

    public void registrarDeslike(Perfil origem, Perfil destino) {
        System.out.println("Deslike registrado.");
    }
}

