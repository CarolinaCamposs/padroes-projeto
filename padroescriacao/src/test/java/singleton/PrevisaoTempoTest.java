package singleton;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrevisaoTempoTest {

    @Test
    public void deveRetornarPrevisaoTempo() {
        PrevisaoTempo.getInstance().setPrevisaoTempo("Ensolarado");
        assertEquals("Ensolarado", PrevisaoTempo.getInstance().getPrevisaoTempo());
    }

    @Test
    public void deveRetornarTemperatura() {
        PrevisaoTempo.getInstance().setTemperatura(32);
        assertEquals(32, PrevisaoTempo.getInstance().getTemperatura());
    }
}

