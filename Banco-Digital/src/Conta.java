public abstract class Conta implements iConta {

    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {

        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgemcia() {
        return agencia;
    }

    public void setAgemcia(int agemcia) {
        this.agencia = agemcia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    protected void imprimeInfoConta() {
        System.out.println(String.format("Nome: %s", this.cliente.nome));
        System.out.println(String.format("CPF: %s", this.cliente.cpf));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }


}
