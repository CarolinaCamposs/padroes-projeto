package state.Elevador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevadorTest {

    Elevador elevador;

    @BeforeEach
    public void setUp() {
        elevador = new Elevador();
    }

    // Elevador parado

    @Test
    public void naoDevePararElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertFalse(elevador.parar());
    }

    @Test
    public void deveSubirElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertTrue(elevador.subir());
        assertEquals(ElevadorEstadoSubindo.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveDescerElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertTrue(elevador.descer());
        assertEquals(ElevadorEstadoDescendo.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveAbrirPortaElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertTrue(elevador.abrirPorta());
        assertEquals(ElevadorEstadoPortaAberta.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveFecharPortaElevadorParado() {
        elevador.setEstado(ElevadorEstadoParado.getInstance());
        assertTrue(elevador.fecharPorta());
        assertEquals(ElevadorEstadoPortaFechada.getInstance(), elevador.getEstado());
    }

    // Elevador descendo

    @Test
    public void naoDeveDescerElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.descer());
    }
    @Test
    public void devePararElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertTrue(elevador.parar());
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveSubirElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertTrue(elevador.subir());
        assertEquals(ElevadorEstadoSubindo.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveAbrirPortaElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.abrirPorta());
    }

    @Test
    public void naoDeveFecharPortaElevadorDescendo() {
        elevador.setEstado(ElevadorEstadoDescendo.getInstance());
        assertFalse(elevador.fecharPorta());
    }

    // Elevador subindo

    @Test
    public void naoDeveSubirElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.subir());
    }

    @Test
    public void devePararElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertTrue(elevador.parar());
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveDescerElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertTrue(elevador.descer());
        assertEquals(ElevadorEstadoDescendo.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveAbrirPortaElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.abrirPorta());
    }

    @Test
    public void naoDeveFecharPortaElevadorSubindo() {
        elevador.setEstado(ElevadorEstadoSubindo.getInstance());
        assertFalse(elevador.fecharPorta());
    }

    // Elevador com a porta aberta

    @Test
    public void naoDeveAbrirPortaElevadorPortaAberta() {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        assertFalse(elevador.abrirPorta());
    }

    @Test
    public void naoDevePararElevadorPortaAberta() {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        assertFalse(elevador.parar());
    }

    @Test
    public void naoDeveSubirElevadorPortaAberta() {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        assertFalse(elevador.subir());
    }

    @Test
    public void naoDeveDescerElevadorPortaAberta() {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        assertFalse(elevador.descer());
    }

    @Test
    public void deveFecharPortaElevadorPortaAberta() {
        elevador.setEstado(ElevadorEstadoPortaAberta.getInstance());
        assertTrue(elevador.fecharPorta());
        assertEquals(ElevadorEstadoPortaFechada.getInstance(), elevador.getEstado());
    }

    // Elevador com a porta fechada

    @Test
    public void devePararElevadorPortaFechada() {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        assertTrue(elevador.parar());
        assertEquals(ElevadorEstadoParado.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveSubirElevadorPortaFechada() {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        assertTrue(elevador.subir());
        assertEquals(ElevadorEstadoSubindo.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveDescerElevadorPortaFechada() {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        assertTrue(elevador.descer());
        assertEquals(ElevadorEstadoDescendo.getInstance(), elevador.getEstado());
    }

    @Test
    public void deveAbrirPortaElevadorPortaFechada() {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        assertTrue(elevador.abrirPorta());
        assertEquals(ElevadorEstadoPortaAberta.getInstance(), elevador.getEstado());
    }

    @Test
    public void naoDeveFecharPortaElevadorPortaFechada() {
        elevador.setEstado(ElevadorEstadoPortaFechada.getInstance());
        assertFalse(elevador.fecharPorta());
    }
}