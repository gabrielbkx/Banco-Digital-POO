import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> listaDeContas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaDeContas = new ArrayList<>();
    }

    // Métodos para adicionar e remover contas
    public void adicionarConta(Conta conta) {
        listaDeContas.add(conta);
    }

    public void removerConta(Conta conta) {
        listaDeContas.remove(conta);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Conta> getListaDeContas() {
        return listaDeContas;
    }
}
