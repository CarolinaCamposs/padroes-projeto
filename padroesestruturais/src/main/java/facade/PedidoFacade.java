package facade;

public class PedidoFacade {
    public static boolean verificarDisponibilidade(Pedido pedido) {
        if (Cozinha.getInstancia().verificarPedidoPendente(pedido)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarPedidoPendente(pedido)) {
            return false;
        }
        return true;
    }
}
