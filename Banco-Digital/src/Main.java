public class Main {

    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.imprimirExtrato();
        contaCorrente.depositar(150.26);
        System.out.println();
        contaCorrente.imprimirExtrato();
        System.out.println();
        contaPoupanca.imprimirExtrato();
        contaCorrente.transferir(150, contaPoupanca);
        System.out.println();
        contaCorrente.imprimirExtrato();
        System.out.println();
        contaPoupanca.imprimirExtrato();
        contaCorrente.sacar(20);

    }
}
