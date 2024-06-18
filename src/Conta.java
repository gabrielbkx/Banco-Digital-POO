import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@ToString
public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
    private List<Transacao> listaDeTransacoes;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.listaDeTransacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public List<Transacao> getListaDeTransacoes() {
        return listaDeTransacoes;
    }

    public void depositar(double valor) {
        saldo += valor;
        listaDeTransacoes.add(new Transacao(new Date(), "DEPOSITO", valor, this, null));
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            listaDeTransacoes.add(new Transacao(new Date(), "SAQUE", valor, this, null));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            listaDeTransacoes.add(new Transacao(new Date(), "TRANSFERENCIA", valor, this, destino));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        for (Transacao t : listaDeTransacoes) {
            System.out.println(t.getData() + " - " + t.getTipo() + " - " + t.getValor());
        }
    }
}
