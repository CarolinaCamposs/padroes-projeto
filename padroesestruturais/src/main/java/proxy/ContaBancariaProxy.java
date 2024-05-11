package proxy;

import java.util.List;

public class ContaBancariaProxy implements IContaBancaria {

    private ContaBancaria conta;

    private Integer numeroConta;

    public ContaBancariaProxy(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public List<String> obterDadosConta() {
        if (this.conta == null) {
            this.conta = new ContaBancaria(this.numeroConta);
        }
        return this.conta.obterDadosConta();
    }

    @Override
    public Float consultarSaldo(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.conta == null) {
            this.conta = new ContaBancaria(this.numeroConta);
        }
        return this.conta.consultarSaldo(funcionario);
    }
}