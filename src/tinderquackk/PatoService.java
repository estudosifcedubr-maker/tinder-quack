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
}