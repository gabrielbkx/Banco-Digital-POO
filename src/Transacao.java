import java.util.Date;

public class Transacao {
    private Date data;
    private String tipo;
    private double valor;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao(Date data, String tipo, double valor, Conta contaOrigem, Conta contaDestino) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    // Getters e setters
    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }
}
