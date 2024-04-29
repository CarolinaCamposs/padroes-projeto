package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoListaGeneroTest {

    @Test
    void deveReproduzirListaGenero() {
        IServico servico = ServicoFactory.obterServicoReproducao("ListaGenero");
        assertEquals("Reproduzindo lista de gênero...", servico.reproduzir());
    }

    @Test
    void devePausarReproducaoListaGenero() {
        IServico servico = ServicoFactory.obterServicoReproducao("ListaGenero");
        assertEquals("Pausando reprodução da lista de gênero...", servico.pausar());
    }
}