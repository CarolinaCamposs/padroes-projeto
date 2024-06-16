package templatemethod;

public class PedidoVip extends Pedido{

    @Override
    public String verificarDesconto() {
        if (this.calcularTotal() >= 1000.0f) {
            return "Desconto Aplicado";
        } else {
            return "Sem Desconto";
        }
    }
}
