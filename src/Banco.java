import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> listaDeClientes;
    private List<Conta> listaDeContas;

    public Banco(String nome) {
        this.nome = nome;
        this.listaDeClientes = new ArrayList<>();
        this.listaDeContas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        listaDeClientes.remove(cliente);
    }

    public void adicionarConta(Conta conta) {
        listaDeContas.add(conta);
    }

    public void removerConta(Conta conta) {
        listaDeContas.remove(conta);
    }

    public Conta buscarContaPorNumero(int numeroConta) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    // Outros métodos relevantes podem ser adicionados aqui
}
