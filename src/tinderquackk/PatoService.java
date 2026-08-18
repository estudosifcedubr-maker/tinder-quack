package tinderquackk;

import java.util.ArrayList;

public class PatoService {
    private ArrayList<Pato> listaPatos = new ArrayList<>();

    public void adicionarPato(Pato pato) {
        listaPatos.add(pato);
        System.out.println(">>> Pato ID " + pato.getIdPato() + " cadastrado no sistema!");
    }

    public void listarPatos() {
        if (listaPatos.isEmpty()) {
            System.out.println("Nenhum pato cadastrado.");
        } else {
            System.out.println("\n--- Lista de Patos no Sistema ---");
            for (Pato p : listaPatos) {
                System.out.println("ID: " + p.getIdPato() + " - Nome: " + p.getNome() + " - Email: " + p.getEmail());
                if (p instanceof PatoDomestico) {
                    PatoDomestico pd = (PatoDomestico) p;
                    System.out.println("   (Espécie: Doméstico - Raça: " + pd.getRaca() + ")");
                } else if (p instanceof PatoSelvagem) {
                    PatoSelvagem ps = (PatoSelvagem) p;
                    System.out.println("   (Espécie: Selvagem - Origem: " + ps.getRegiaoOrigem() + ")");
                }
                System.out.println("-------------------------");
            }
        }
    }

    private ArrayList<String> historicoCurtidas = new ArrayList<>();

    public Pato buscarPatoPorId(int id) {
        for (Pato p : listaPatos) {
            if (p.getIdPato() == id) {
                return p;
            }
        }
        return null;
    }

    public void atualizarPato(int id, String novoNome, int novaIdade) {
        Pato patoEncontrado = buscarPatoPorId(id);
        if (patoEncontrado != null) {
            patoEncontrado.setNome(novoNome);
            patoEncontrado.setIdade(novaIdade);
            System.out.println(">>> Dados do Pato ID " + id + " atualizados!");
        } else {
            System.out.println("Erro: Pato com ID " + id + " não encontrado.");
        }
    }

    public void deletarPato(int id) {
        Pato patoEncontrado = buscarPatoPorId(id);
        if (patoEncontrado != null) {
            listaPatos.remove(patoEncontrado);
            System.out.println(">>> Pato ID " + id + " removido do sistema.");
        } else {
            System.out.println("Erro: Pato com ID " + id + " não encontrado.");
        }
    }
    
    public void curtirPato(int idQuemCurtiu, int idCurtido) {
        Pato curtidor = buscarPatoPorId(idQuemCurtiu);
        Pato curtido = buscarPatoPorId(idCurtido);

        if (curtidor != null && curtido != null) {
            if (idQuemCurtiu == idCurtido) {
                System.out.println("Você não pode curtir a si mesmo!");
            } else {
                String chaveCurtida = idQuemCurtiu + "-" + idCurtido;
                if (historicoCurtidas.contains(chaveCurtida)) {
                    System.out.println("Você já curtiu esse pato anteriormente.");
                } else {
                    historicoCurtidas.add(chaveCurtida);                    
                    System.out.println("\n>>> " + curtidor.getNome() + " curtiu " + curtido.getNome() + "!");            
                    String chaveInversa = idCurtido + "-" + idQuemCurtiu;
                    if (historicoCurtidas.contains(chaveInversa)) {
                        System.out.println("💖💖💖 É UM MATCH! 💖💖💖");
                        System.out.println(curtidor.getNome() + " e " + curtido.getNome() + " se curtiram mutuamente!");
                    } else {
                        System.out.println("Aguardando " + curtido.getNome() + " te curtir de volta...");
                    }
                }
            }
        } else {
            System.out.println("Erro: Um dos patos não foi encontrado.");
        }
    }

    public void enviarMensagem(int idRemetente, int idDestinatario, String texto) {
        Pato remetente = buscarPatoPorId(idRemetente);
        Pato destinatario = buscarPatoPorId(idDestinatario);

        if (remetente != null && destinatario != null) {
            if (idRemetente == idDestinatario) {
                System.out.println("Você não pode enviar mensagem para si mesmo!");
            } else {
                System.out.println("\n--- MENSAGEM ENVIADA ---");
                System.out.println("De: " + remetente.getNome());
                System.out.println("Para: " + destinatario.getNome());
                System.out.println("Conteúdo: \"" + texto + "\"");
                System.out.println("------------------------");
            }
        } else {
            System.out.println("Erro: Um dos patos não foi encontrado.");
        }
    }
}