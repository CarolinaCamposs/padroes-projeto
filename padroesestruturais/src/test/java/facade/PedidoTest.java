package facade;

import org.junit.jupiter.api.Test;

import javax.xml.validation.TypeInfoProvider;

import static org.junit.Assert.assertEquals;

public class PedidoTest {

    @Test
    void deveRetornarPedidoComPendenciaCozinha() {
        Pedido pedido = new Pedido();
        Cozinha.getInstancia().adicionarPedidoPendente(pedido);

        assertEquals(false, pedido.fazerPedido());

    }

    @Test
    void deveRetornarPedidoComPendenciaPagamento() {
        Pedido pedido = new Pedido();
        Pagamento.getInstancia().adicionarPedidoPendente(pedido);

        assertEquals(false, pedido.fazerPedido());
    }

    @Test
    void deveRetornarPedidoSemPendencia() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.fazerPedido());
    }
}