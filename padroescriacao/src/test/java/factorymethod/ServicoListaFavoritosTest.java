package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoListaFavoritosTest {

    @Test
    void deveReproduzirListaFavoritos() {
        IServico servico = ServicoFactory.obterServicoReproducao("ListaFavoritos");
        assertEquals("Reproduzindo lista de favoritos...", servico.reproduzir());
    }

    @Test
    void devePausarReproducaoListaFavoritos() {
        IServico servico = ServicoFactory.obterServicoReproducao("ListaFavoritos");
        assertEquals("Pausando reprodução da lista de favoritos...", servico.pausar());
    }
}