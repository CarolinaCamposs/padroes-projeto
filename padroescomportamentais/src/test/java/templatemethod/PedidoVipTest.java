package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoVipTest {

    @Test
    void deveRetornarDescontoAplicado() {
        PedidoVip pedido = new PedidoVip();
        pedido.setValorItem1(800.0f);
        pedido.setValorItem2(200.0f);
        assertEquals("Desconto Aplicado", pedido.verificarDesconto());
    }

    @Test
    void deveRetornarSemDesconto() {
        PedidoVip pedido = new PedidoVip();
        pedido.setValorItem1(600.0f);
        pedido.setValorItem2(399.9f);
        assertEquals("Sem Desconto", pedido.verificarDesconto());
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoVip pedido = new PedidoVip();
        pedido.setValorItem1(800.0f);
        pedido.setValorItem2(200.0f);
        pedido.setCliente("Ana");
        pedido.setId(2);
        assertEquals("Pedido{id=2, cliente='Ana', desconto=Desconto Aplicado}", pedido.getInfo());
    }

}