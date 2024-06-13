package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {

    @Test
    void deveReservarPassagem() {
        Passageiro passageiro = new Passageiro();
        assertEquals("Passagem reservada para Nova York na data 2024-07-01.\n" +
                        "Aguarde enquanto processamos sua reserva.",
                passageiro.reservarPassagem("Nova York", "2024-07-01"));
    }

    @Test
    void deveCancelarReserva() {
        Passageiro passageiro = new Passageiro();
        assertEquals("Reserva cancelada: 123456",
                passageiro.cancelarReserva("123456"));
    }

    @Test
    void deveEfetuarPagamento() {
        Passageiro passageiro = new Passageiro();
        assertEquals("Pagamento efetuado para reserva 789012 no valor de R$1500.0.",
                passageiro.efetuarPagamento("789012", 1500.0));
    }

}