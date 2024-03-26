package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FuncionarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCpf() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Funcionario 1")
                    .setEmail("funcionario@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComEmailInvalido() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Funcionario 3")
                    .setCpf("12345678901")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("E-mail inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComNomeVazio() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCpf("12345678901")
                    .setEmail("funcionario3@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome não pode ser vazio", e.getMessage());
        }
    }
}
