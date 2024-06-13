package command;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public String sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return "Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo;
        } else {
            return "Saldo insuficiente para saque.";
        }
    }

    public String depositar(double valor) {
        saldo += valor;
        return "Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo;
    }

    public String transferir(ContaBancaria contaDestino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            return "Transferência de R$ " + valor + " para " + contaDestino.getTitular() + " realizada com sucesso. Saldo atual: R$ " + saldo;
        } else {
            return "Saldo insuficiente para transferência.";
        }
    }

    public String consultarSaldo() {
        return "Saldo atual de " + titular + ": R$ " + saldo;
    }

    public String getTitular() {
        return titular;
    }
}
