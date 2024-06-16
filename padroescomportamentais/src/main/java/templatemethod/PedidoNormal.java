package templatemethod;

public class PedidoNormal extends Pedido {

    @Override
    public String verificarDesconto() {
        if (this.calcularTotal() >= 500.0f) {
            return "Desconto Aplicado";
        } else {
            return "Sem Desconto";
        }
    }

    @Override
    public String getTipo() {
        return "PedidoNormal";
    }
}
