package proxy;

import java.util.Arrays;
import java.util.List;

public class ContaBancaria implements IContaBancaria {

    private Integer numeroConta;
    private String titular;
    private Float saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        ContaBancaria objeto = BD.getConta(numeroConta);
        this.titular = objeto.titular;
        this.saldo = objeto.saldo;
    }

    public ContaBancaria(Integer numeroConta, String titular, Float saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    @Override
    public List<String> obterDadosConta() {
        return Arrays.asList(this.titular);
    }

    @Override
    public Float consultarSaldo(Funcionario funcionario) {
        return this.saldo;
    }
}