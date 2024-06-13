package command;

public class ConsultarSaldoOperacao implements Operacao {

    private ContaBancaria conta;

    public ConsultarSaldoOperacao(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void executar() {
        this.conta.consultarSaldo();
    }

    @Override
    public void cancelar() {

    }
}
