package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CinemaTest {

    @Test
    void deveRetornarReservas() {
        Cinema cinema = new Cinema();
        cinema.fazerReserva("João", "A1", "Premium");
        cinema.fazerReserva("Maria", "B2", "Regular");
        cinema.fazerReserva("Pedro", "A3", "Premium");
        cinema.fazerReserva("Ana", "C4", "Regular");

        List<String> saida = Arrays.asList(
                "Reserva{cliente='João', assento='A1', tipo='Premium'}",
                "Reserva{cliente='Maria', assento='B2', tipo='Regular'}",
                "Reserva{cliente='Pedro', assento='A3', tipo='Premium'}",
                "Reserva{cliente='Ana', assento='C4', tipo='Regular'}");

        assertEquals(saida, cinema.obterReservas());
    }

    @Test
    void deveRetornarTotalTiposAssento() {
        Cinema cinema = new Cinema();
        cinema.fazerReserva("João", "A1", "Premium");
        cinema.fazerReserva("Maria", "B2", "Regular");
        cinema.fazerReserva("Pedro", "A3", "Premium");
        cinema.fazerReserva("Ana", "C4", "Regular");

        assertEquals(2, TipoAssentoFactory.getTotalTiposAssento());
    }

}