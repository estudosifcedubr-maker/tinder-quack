package tinderquackk;

public class Match {
    private int idMatch;
    private Perfil perfil1;
    private Perfil perfil2;
    private static int contadorMatch = 1;

    public Match() {
        this.idMatch = contadorMatch++;
    }

    public void criarMatch(Perfil p1, Perfil p2) {
        this.perfil1 = p1;
        this.perfil2 = p2;
        System.out.println("Match criado entre " + p1.getNomeDoUsuario() + " e " + p2.getNomeDoUsuario() + "!");
    }
}