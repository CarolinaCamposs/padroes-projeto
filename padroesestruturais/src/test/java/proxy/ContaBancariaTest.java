package proxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaBancariaTest {

    @BeforeEach
    void setUp() {
        BD.addConta(new ContaBancaria(1, "João", 1000.0f));
        BD.addConta(new ContaBancaria(2, "Maria", 2000.0f));
    }

    @Test
    void deveRetornarDadosContaBancaria() {
        ContaBancariaProxy conta = new ContaBancariaProxy(1);

        assertEquals(Arrays.asList("João"), conta.obterDadosConta());
    }

    @Test
    void deveRetornarSaldoContaBancaria() {
        Funcionario funcionario = new Funcionario("Ana", true);
        ContaBancariaProxy conta = new ContaBancariaProxy(2);

        assertEquals(2000.0f, conta.consultarSaldo(funcionario));
    }

    @Test
    void deveRetornarExcecaoUsuarioNaoAutorizadoConsultarSaldoContaBancaria() {
        Funcionario funcionario = new Funcionario("Joana", false);
        ContaBancariaProxy conta = new ContaBancariaProxy(2);

        try {
            conta.consultarSaldo(funcionario);
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}
