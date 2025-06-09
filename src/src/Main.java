public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banco Digital RMN");

        Cliente Ramon = new Cliente("Ramon M. Silva");
        Cliente Renan= new Cliente("renan Santos");

        Conta ccRamon = new ContaCorrente(Ramon);
        Conta cpRenan = new ContaPoupanca(Renan);

        meuBanco.adicionarConta(ccRamon);
        meuBanco.adicionarConta(cpRenan);

        ccRamon.depositar(1200.50);
        cpRenan.depositar(5000.00);

        ccRamon.transferir(200.50, cpRenan);

        ccRamon.imprimirextrato();
        System.out.println();
        cpRenan.imprimirextrato();
    }
}
