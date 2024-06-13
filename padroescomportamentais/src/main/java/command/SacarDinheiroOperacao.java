package command;

public class SacarDinheiroOperacao implements Operacao {

    private ContaBancaria conta;
    private double valor;

    public SacarDinheiroOperacao(ContaBancaria conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void executar() {
        this.conta.sacar(valor);
    }

    @Override
    public void cancelar() {
        this.conta.depositar(valor);
    }
}
