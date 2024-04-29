package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPlaylistDesconhecida() {
        try {
            IServico servico = ServicoFactory.obterServicoReproducao("PlaylistDesconhecida");
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Serviço inexistente", exception.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServicoReproducao("ServicoInexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

}