package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoNormalTest {

    @Test
    void deveRetornarDescontoAplicado() {
        PedidoNormal pedido = new PedidoNormal();
        pedido.setValorItem1(300.0f);
        pedido.setValorItem2(200.0f);
        assertEquals("Desconto Aplicado", pedido.verificarDesconto());
    }

    @Test
    void deveRetornarSemDesconto() {
        PedidoNormal pedido = new PedidoNormal();
        pedido.setValorItem1(200.0f);
        pedido.setValorItem2(299.9f);
        assertEquals("Sem Desconto", pedido.verificarDesconto());
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoNormal pedido = new PedidoNormal();
        pedido.setValorItem1(300.0f);
        pedido.setValorItem2(200.0f);
        pedido.setCliente("Carlos");
        pedido.setId(1);
        assertEquals("PedidoNormal{id=1, cliente='Carlos', desconto=Desconto Aplicado}", pedido.getInfo());
    }

}