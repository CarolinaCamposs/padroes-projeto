package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurante {

    private List<Pedido> pedidosPendentes = new ArrayList<>();

    public void adicionarPedidoPendente(Pedido pedido) {
        this.pedidosPendentes.add(pedido);
    }

    public boolean verificarPedidoPendente(Pedido pedido) {
        return this.pedidosPendentes.contains(pedido);
    }

}