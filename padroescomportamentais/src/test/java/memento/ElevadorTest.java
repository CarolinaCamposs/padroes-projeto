package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevadorTest {

    @Test
    void deveArmazenarEstados() {
        Elevador elevador = new Elevador();
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertEquals(2, elevador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Elevador elevador = new Elevador();
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        elevador.restauraEstado(0);
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Elevador elevador = new Elevador();
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        elevador.restauraEstado(2);
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    void  deveRetornarExcecaoIndiceInvalido() {
        try {
            Elevador elevador = new Elevador();
            elevador.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}