package tinderquackk;

public class Perfil {
    private String bio;
    private String nomeDoUsuario;
    private String cidade;
   
    private Pato donoDoPerfil;

    public Perfil(Pato dono) {
        this.donoDoPerfil = dono;
        this.nomeDoUsuario = dono.getNome() + "_User";
    }

    public void setBio(String bio) { this.bio = bio; }
    public String getBio() { return bio; }

    public void setNomeDoUsuario(String nomeDoUsuario) { this.nomeDoUsuario = nomeDoUsuario; }
    public String getNomeDoUsuario() { return nomeDoUsuario; }

    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getCidade() { return cidade; }

    public Pato getDonoDoPerfil() { return donoDoPerfil; }
}
 
