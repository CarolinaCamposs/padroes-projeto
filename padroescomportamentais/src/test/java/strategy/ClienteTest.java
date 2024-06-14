package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCalcularPagamentoComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito(100.0f);
        assertEquals(105.0f, cliente.getTotal());
    }

    @Test
    void deveCalcularPagamentoComCartaoDebito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoDebito(100.0f);
        assertEquals(101.0f, cliente.getTotal());
    }

    @Test
    void deveCalcularPagamentoComBoleto() {
        Cliente cliente = new Cliente();
        cliente.pagarComBoleto(100.0f);
        assertEquals(98.0f, cliente.getTotal());
    }

    @Test
    void deveCalcularPagamentoComTransferencia() {
        Cliente cliente = new Cliente();
        cliente.pagarComTransferencia(100.0f);
        assertEquals(100.0f, cliente.getTotal());
    }

}