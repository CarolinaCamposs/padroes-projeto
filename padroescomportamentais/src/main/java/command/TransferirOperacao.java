package command;

public class TransferirOperacao implements Operacao {

    private ContaBancaria contaOrigem;
    private ContaBancaria contaDestino;
    private double valor;

    public TransferirOperacao(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    @Override
    public void executar() {
        this.contaOrigem.transferir(contaDestino, valor);
    }

    @Override
    public void cancelar() {
        this.contaDestino.transferir(contaOrigem, valor);
    }
}
