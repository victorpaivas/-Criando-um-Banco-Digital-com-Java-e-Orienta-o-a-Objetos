import java.util.List;

public class Banco {

    protected Cliente cliente;
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
