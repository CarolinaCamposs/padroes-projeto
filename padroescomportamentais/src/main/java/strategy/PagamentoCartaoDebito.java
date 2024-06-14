package strategy;

public class PagamentoCartaoDebito implements CalculoPagamento {

    public float calcular(float valor) {
        return valor + (valor * 0.01f);
    }
}
