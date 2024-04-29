package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoListaPersonalizadaTest {

    @Test
    void deveReproduzirListaPersonalizada() {
        IServico servico = ServicoFactory.obterServicoReproducao("ListaPersonalizada");
        assertEquals("Reproduzindo lista personalizada...", servico.reproduzir());
    }

    @Test
    void devePausarReproducaoListaPersonalizada() {
        IServico servico = ServicoFactory.obterServicoReproducao("ListaPersonalizada");
        assertEquals("Pausando reprodução da lista personalizada...", servico.pausar());
    }
}