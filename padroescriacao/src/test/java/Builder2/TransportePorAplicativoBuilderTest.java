package Builder2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TransportePorAplicativoBuilderTest {

    @Test
    void deveRetornarExcecaoParaNomeMotoristaVazio() {
        try {
            TransportePorAplicativoBuilder transportePorAplicativoBuilder = new TransportePorAplicativoBuilder();
            TransportePorAplicativo transportePorAplicativo = transportePorAplicativoBuilder
                    .setNomeMotorista("")
                    .setModeloCarro("Toyota Corolla")
                    .setPlacaCarro("ABC1234")
                    .setCidade("São Paulo")
                    .setTarifaBase(5.0)
                    .setTarifaPorKm(2.0)
                    .setDisponivel(true)
                    .setAvaliacaoMedia(4)
                    .setNumeroTelefone("123456789")
                    .setEmail("joao@example.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do motorista não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEmailVazio() {
        try {
            TransportePorAplicativoBuilder transportePorAplicativoBuilder = new TransportePorAplicativoBuilder();
            TransportePorAplicativo transportePorAplicativo = transportePorAplicativoBuilder
                    .setNomeMotorista("João")
                    .setModeloCarro("Toyota Corolla")
                    .setPlacaCarro("ABC1234")
                    .setCidade("São Paulo")
                    .setTarifaBase(5.0)
                    .setTarifaPorKm(2.0)
                    .setDisponivel(true)
                    .setAvaliacaoMedia(4)
                    .setNumeroTelefone("123456789")
                    .setEmail("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("E-mail não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPlacaVazia() {
        try {
            TransportePorAplicativoBuilder transportePorAplicativoBuilder = new TransportePorAplicativoBuilder();
            TransportePorAplicativo transportePorAplicativo = transportePorAplicativoBuilder
                    .setNomeMotorista("João")
                    .setModeloCarro("Toyota Corolla")
                    .setPlacaCarro("")
                    .setCidade("São Paulo")
                    .setTarifaBase(5.0)
                    .setTarifaPorKm(2.0)
                    .setDisponivel(true)
                    .setAvaliacaoMedia(4)
                    .setNumeroTelefone("123456789")
                    .setEmail("joao@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Placa do carro não pode ser vazia", e.getMessage());
        }
    }
}
