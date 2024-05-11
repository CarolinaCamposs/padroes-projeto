package proxy;

import java.util.List;

public interface IContaBancaria {
    List<String> obterDadosConta();
    Float consultarSaldo(Funcionario funcionario);
}