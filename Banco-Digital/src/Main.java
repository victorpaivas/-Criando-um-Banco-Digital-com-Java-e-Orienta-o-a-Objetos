public class Main {

    public static void main(String[] args) {

        Cliente victor = new Cliente();
        victor.setNome("Victor");
        victor.setCpf("333.333.333-00");
        Cliente jose = new Cliente();

        Conta cc1 = new ContaCorrente(victor);
        Conta cp2 = new ContaPoupanca(jose);

        cc1.imprimirExtrato();
        cc1.depositar(350.00);
        System.out.println();


    }
}
