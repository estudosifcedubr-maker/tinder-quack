package tinderquackk;

import java.util.Scanner;

public class Perfil {
    private String bio;
    private String foto;
    private String nomeDoUsuario;
    private String cidade;
    private String estado;
    private String lago;

    public Perfil() {}

    
    public void setBio(String bio) { this.bio = bio; }
    public String getBio() { return bio; }

    public void setFoto(String foto) { this.foto = foto; }
    public String getFoto() { return foto; }

    public void setNomeDoUsuario(String nomeDoUsuario) { this.nomeDoUsuario = nomeDoUsuario; }
    public String getNomeDoUsuario() { return nomeDoUsuario; }

    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getCidade() { return cidade; }

    public void setEstado(String estado) { this.estado = estado; }
    public String getEstado() { return estado; }

    public void setLago(String lago) { this.lago = lago; }
    public String getLago() { return lago; }

    
    public void cadastrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- Criando Perfil ---");
        System.out.print("Nome de Usuário: ");
        this.nomeDoUsuario = entrada.nextLine();
        System.out.print("Bio: ");
        this.bio = entrada.nextLine();
        System.out.print("Cidade: ");
        this.cidade = entrada.nextLine();
        System.out.print("Estado: ");
        this.estado = entrada.nextLine();
        System.out.print("Lago Preferido: ");
        this.lago = entrada.nextLine();
        System.out.print("URL da Foto: ");
        this.foto = entrada.nextLine();
    }

    public void editarBio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nova Bio: ");
        this.bio = entrada.nextLine();
    }

    public void editarFoto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nova URL da Foto: ");
        this.foto = entrada.nextLine();
    }

    public void editarNomeDoUsuario() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Novo Nome de Usuário: ");
        this.nomeDoUsuario = entrada.nextLine();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
