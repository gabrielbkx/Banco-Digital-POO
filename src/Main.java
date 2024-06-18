
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco Digital");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Criando contas para os clientes
        Conta conta1 = new Conta(1, cliente1);
        Conta conta2 = new Conta(2, cliente2);

        // Adicionando contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Operações bancárias
        conta1.depositar(500.0);
        conta1.sacar(100.0);
        conta1.transferir(conta2, 200.0);

        // Consultando saldos
        System.out.println("Saldo da conta 1: " + conta1.consultarSaldo());
        System.out.println("Saldo da conta 2: " + conta2.consultarSaldo());

        // Imprimindo extratos
        System.out.println("Extrato da conta 1:");
        conta1.imprimirExtrato();

        System.out.println("Extrato da conta 2:");
        conta2.imprimirExtrato();
    }
}
