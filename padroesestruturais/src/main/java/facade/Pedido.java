package facade;

public class Pedido {
    public boolean fazerPedido() {
        return PedidoFacade.verificarDisponibilidade(this);
    }
}
